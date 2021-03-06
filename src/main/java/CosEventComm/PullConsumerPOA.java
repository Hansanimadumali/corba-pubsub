package CosEventComm;


/**
 * Generated from IDL interface "PullConsumer".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public abstract class PullConsumerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, CosEventComm.PullConsumerOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "disconnect_pull_consumer", Integer.valueOf(0));
	}
	private String[] ids = {"IDL:CosEventComm/PullConsumer:1.0"};
	public CosEventComm.PullConsumer _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		CosEventComm.PullConsumer __r = CosEventComm.PullConsumerHelper.narrow(__o);
		return __r;
	}
	public CosEventComm.PullConsumer _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		CosEventComm.PullConsumer __r = CosEventComm.PullConsumerHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // disconnect_pull_consumer
			{
				_out = handler.createReply();
				disconnect_pull_consumer();
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
