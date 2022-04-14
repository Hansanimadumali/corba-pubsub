package PublishSubscribe;


import CosEventComm.PushSupplier;
import org.omg.CORBA.BAD_PARAM;
import org.omg.CORBA.ORB;
import org.omg.CosEventChannelAdmin.*;
import org.omg.CosEventComm.PushSupplierHelper;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

public class PublisherApp{
    private ORB orb;
    private POA rootPOA;
    private String nodeName;

    private void initializeORB(String[] args){
        this.nodeName = args[0];
       orb = ORB.init(args,null);
       try {
           rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
       }catch (org.omg.CORBA.ORBPackage.InvalidName ex){}

    }

    private void businessLogic(final PublisherImpl p_impl){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(;;){
                    Message message1   = new Message();
                    message1.number = (int) (1000*Math.random());
                    message1.server = nodeName;
                    message1.timestamp = Long.toString(System.currentTimeMillis());
                    System.out.println("Pushing message: "+ message1.number);
                    try {
                        p_impl.publish(message1);
                        Thread.sleep(1000);
                    }catch (InterruptedException ign){}
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public PublisherApp(String [] args) {
        try {
            initializeORB(args);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    orb.run();
                }
            }).start();
            NamingContextExt nc = NamingContextExtHelper.narrow(orb.resolve_initial_references("NameService"));
            EventChannel ec = EventChannelHelper.narrow(nc.resolve(nc.to_name("eventchannel.single")));
            SupplierAdmin sa = ec.for_suppliers();
            ProxyPushConsumer ppc = sa.obtain_push_consumer();
            PublisherImpl p_impl = new PublisherImpl(orb,ppc);
            Publisher p = p_impl._this(orb);

            try {
                org.omg.CosEventComm.PushSupplier ps = org.omg.CosEventComm.PushSupplierHelper.unchecked_narrow(p);
                System.out.println("Test");
                ppc.connect_push_supplier(ps);
            }catch (AlreadyConnected ex){}
            System.out.println("Publisher started. Stop : Ctrl-C");
            rootPOA.the_POAManager().activate();
            businessLogic(p_impl);
        }catch (BAD_PARAM ex){
            System.out.println("Narrowing failed");
            ex.printStackTrace();
            System.exit(3);
        }catch (Exception ex){
            System.out.println("Exception: "+ex.getMessage());
//            System.exit(1);
        }
    }

    public static void main(String [] args){
        new PublisherApp(args);
    }
}
