package PublishSubscribe;

import org.omg.CORBA.Any;
import org.omg.CORBA.OBJECT_NOT_EXIST;
import org.omg.CORBA.ORB;
import org.omg.CosEventComm.*;
import org.omg.CosEventChannelAdmin.*;

public class PublisherImpl extends PublisherPOA{
    private ORB orb;
    private ProxyPushConsumer ppc;
    private boolean disconn = false;

    public PublisherImpl(ORB orb, ProxyPushConsumer ppc) {
        this.orb = orb;
        this.ppc = ppc;
    }

    public void publish(Message msg){
        Any message = orb.create_any();
        MessageHelper.insert(message,msg);
        try {
            ppc.push(message);
        }catch (Disconnected ex){
            System.out.println("ProxyPushConsumer is disconnected" + "from ES") ;
            System.exit(0);
        }
    }


    @Override
    public void disconnect_push_supplier() {
        if(disconn)
            throw new OBJECT_NOT_EXIST();
        disconn = true;
        ppc.disconnect_push_consumer();
        System.out.println("Disconnected Publisher");
    }
}
