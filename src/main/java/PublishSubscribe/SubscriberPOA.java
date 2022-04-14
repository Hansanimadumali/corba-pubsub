package PublishSubscribe;


/**
 * Generated from IDL interface "Subscriber".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public abstract class SubscriberPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, PublishSubscribe.SubscriberOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "disconnect_push_consumer", Integer.valueOf(0));
		m_opsHash.put ( "_get_min", Integer.valueOf(1));
		m_opsHash.put ( "_get_max", Integer.valueOf(2));
		m_opsHash.put ( "push", Integer.valueOf(3));
	}
	private String[] ids = {"IDL:PublishSubscribe/Subscriber:1.0","IDL:CosEventComm/PushConsumer:1.0"};
	public PublishSubscribe.Subscriber _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		PublishSubscribe.Subscriber __r = PublishSubscribe.SubscriberHelper.narrow(__o);
		return __r;
	}
	public PublishSubscribe.Subscriber _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		PublishSubscribe.Subscriber __r = PublishSubscribe.SubscriberHelper.narrow(__o);
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
			case 0: // disconnect_push_consumer
			{
				_out = handler.createReply();
				disconnect_push_consumer();
				break;
			}
			case 1: // _get_min
			{
			_out = handler.createReply();
			_out.write_long(min());
				break;
			}
			case 2: // _get_max
			{
			_out = handler.createReply();
			_out.write_long(max());
				break;
			}
			case 3: // push
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				push(_arg0);
			}
			catch(CosEventComm.Disconnected _ex0)
			{
				_out = handler.createExceptionReply();
				CosEventComm.DisconnectedHelper.write(_out, _ex0);
			}
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
