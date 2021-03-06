package CosEventComm;


/**
 * Generated from IDL interface "PullSupplier".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public abstract class PullSupplierPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, CosEventComm.PullSupplierOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "disconnect_pull_supplier", Integer.valueOf(0));
		m_opsHash.put ( "pull", Integer.valueOf(1));
		m_opsHash.put ( "try_pull", Integer.valueOf(2));
	}
	private String[] ids = {"IDL:CosEventComm/PullSupplier:1.0"};
	public CosEventComm.PullSupplier _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		CosEventComm.PullSupplier __r = CosEventComm.PullSupplierHelper.narrow(__o);
		return __r;
	}
	public CosEventComm.PullSupplier _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		CosEventComm.PullSupplier __r = CosEventComm.PullSupplierHelper.narrow(__o);
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
			case 0: // disconnect_pull_supplier
			{
				_out = handler.createReply();
				disconnect_pull_supplier();
				break;
			}
			case 1: // pull
			{
			try
			{
				_out = handler.createReply();
				_out.write_any(pull());
			}
			catch(CosEventComm.Disconnected _ex0)
			{
				_out = handler.createExceptionReply();
				CosEventComm.DisconnectedHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // try_pull
			{
			try
			{
				org.omg.CORBA.BooleanHolder _arg0= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				_out.write_any(try_pull(_arg0));
				_out.write_boolean(_arg0.value);
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
