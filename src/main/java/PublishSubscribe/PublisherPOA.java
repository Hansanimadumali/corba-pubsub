package PublishSubscribe;


/**
 * Generated from IDL interface "Publisher".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public abstract class PublisherPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, PublishSubscribe.PublisherOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "disconnect_push_supplier", Integer.valueOf(0));
	}
	private String[] ids = {"IDL:PublishSubscribe/Publisher:1.0","IDL:CosEventComm/PushSupplier:1.0"};
	public PublishSubscribe.Publisher _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		PublishSubscribe.Publisher __r = PublishSubscribe.PublisherHelper.narrow(__o);
		return __r;
	}
	public PublishSubscribe.Publisher _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		PublishSubscribe.Publisher __r = PublishSubscribe.PublisherHelper.narrow(__o);
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
			case 0: // disconnect_push_supplier
			{
				_out = handler.createReply();
				disconnect_push_supplier();
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
