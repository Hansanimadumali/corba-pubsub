package PublishSubscribe;

import org.omg.CORBA.BAD_PARAM;
import org.omg.CORBA.ORB;
import org.omg.CosEventChannelAdmin.*;
import org.omg.CosEventComm.PushConsumer;
import org.omg.CosEventComm.PushConsumerHelper;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import static java.lang.Math.*;

public class SubscriberApp {

    private ORB orb;
    private POA rootPOA;

    private void initializeORB(String[] args){
        orb = ORB.init(args,null);
        try {
            rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
        }catch (org.omg.CORBA.ORBPackage.InvalidName ex){}

    }

    public SubscriberApp(String [] args){
        try {
            int lo = Integer.valueOf(args[0]), hi = Integer.valueOf(args[1]);
            final int min_this = min(max(lo,0),min(hi,1000));
            final int max_this = max(max(lo,0),min(hi,1000));
            initializeORB(args);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    orb.run();
                }
            }).start();
            NamingContextExt nc = NamingContextExtHelper.narrow(orb.resolve_initial_references("NameService"));
            EventChannel ec = EventChannelHelper.narrow(nc.resolve(nc.to_name("eventchannel.single")));
            ConsumerAdmin ca = ec.for_consumers();
            ProxyPushSupplier pps = ca.obtain_push_supplier();
            SubscriberImpl s_impl = new SubscriberImpl(pps,min_this,max_this);
            Subscriber s = s_impl._this(orb);
            try {
                org.omg.CosEventComm.PushConsumer pc = org.omg.CosEventComm.PushConsumerHelper.unchecked_narrow(s);
                pps.connect_push_consumer(pc);
            }catch (AlreadyConnected ex){}
            System.out.println("Activating Subscriber filtering with " + min_this + " and " + max_this);
            rootPOA.the_POAManager().activate();
            try {
                Thread.sleep(1000*Integer.valueOf(args[2]));
            }catch (InterruptedException ign) {}
            pps.disconnect_push_supplier();
            orb.shutdown(true);

        }catch (BAD_PARAM ex){
            System.out.println("Narrowing failed");
            System.exit(3);
        }catch (Exception ex){
            System.out.println("Exception: "+ex.getMessage());
//            System.exit(1);
        }
    }

    public static void main(String[] args) {
        if(args.length<3){
            System.out.println("Start with" +
                    "\n\trun SubscriberApp <min> <max> <subscriptiontiime> -ORBInitRef...," +
                    " 0 <=min < max <= 1000");
            return;
        }

        new SubscriberApp(args);
    }
}
