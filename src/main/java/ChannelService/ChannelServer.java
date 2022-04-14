package ChannelService;

import org.jacorb.events.EventChannelImpl;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class ChannelServer {
    static public void main( String[] argv )
    {
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(argv, null);
        try
        {
            org.omg.PortableServer.POA poa =
                    org.omg.PortableServer.POAHelper.narrow(
                            orb.resolve_initial_references("RootPOA"));

            NamingContextExt nc =
                    NamingContextExtHelper.narrow(
                            orb.resolve_initial_references("NameService"));

            EventChannelImpl channel = new EventChannelImpl(orb,poa);

            poa.the_POAManager().activate();

            org.omg.CORBA.Object o = poa.servant_to_reference(channel);

            nc.bind(nc.to_name("eventchannel.single"), o);

            orb.run();
        }
        catch( Exception e)
        {
            e.printStackTrace();
        }
    }
}
