package PublishSubscribe;

import org.omg.CORBA.Any;
import org.omg.CORBA.OBJECT_NOT_EXIST;
import org.omg.CosEventChannelAdmin.ProxyPushSupplier;

public class SubscriberImpl extends SubscriberPOA{
    private ProxyPushSupplier pps;
    private int min,max;
    private long sum;
    private int count;

    private  boolean disconn = false;

    public int min(){
        return min;
    }

    public int max(){
        return  max;
    }

    public SubscriberImpl(ProxyPushSupplier pps, int min, int max) {
        this.pps = pps;
        this.min = min;
        this.max = max;
        this.count = 0;
        this.sum = 0;

    }

    public synchronized void push(Any message){
        count++;
        Message msg = MessageHelper.extract(message);
        int value = msg.number;
//        if(min>=value || value > max)
//            return;
        long diff = System.currentTimeMillis()-Long.parseLong(msg.timestamp);
        sum = sum+diff;
        long average = sum/count;
        System.out.println("Node: "+ msg.server+ ",  messages: "+msg.number +  ", count: "+ count+ ", average: "+average);
    }

    @Override
    public void disconnect_push_consumer() {
        if(disconn)
            throw new OBJECT_NOT_EXIST();
        disconn = true;
//        pps.disconnect_push_supplier();
//        System.out.println("Disconnect Subscriber");
    }
}
