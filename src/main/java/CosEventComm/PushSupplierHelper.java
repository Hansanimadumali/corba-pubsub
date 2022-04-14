package CosEventComm;


/**
 * Generated from IDL interface "PushSupplier".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public abstract class PushSupplierHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PushSupplierHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:CosEventComm/PushSupplier:1.0", "PushSupplier");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final CosEventComm.PushSupplier s)
	{
			any.insert_Object(s);
	}
	public static CosEventComm.PushSupplier extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:CosEventComm/PushSupplier:1.0";
	}
	public static PushSupplier read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(CosEventComm._PushSupplierStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosEventComm.PushSupplier s)
	{
		_out.write_Object(s);
	}
	public static CosEventComm.PushSupplier narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof CosEventComm.PushSupplier)
		{
			return (CosEventComm.PushSupplier)obj;
		}
		else if (obj._is_a("IDL:CosEventComm/PushSupplier:1.0"))
		{
			CosEventComm._PushSupplierStub stub;
			stub = new CosEventComm._PushSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static CosEventComm.PushSupplier unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof CosEventComm.PushSupplier)
		{
			return (CosEventComm.PushSupplier)obj;
		}
		else
		{
			CosEventComm._PushSupplierStub stub;
			stub = new CosEventComm._PushSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
