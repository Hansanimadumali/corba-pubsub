package CosEventComm;


/**
 * Generated from IDL interface "PushConsumer".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public abstract class PushConsumerHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PushConsumerHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:CosEventComm/PushConsumer:1.0", "PushConsumer");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final CosEventComm.PushConsumer s)
	{
			any.insert_Object(s);
	}
	public static CosEventComm.PushConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:CosEventComm/PushConsumer:1.0";
	}
	public static PushConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(CosEventComm._PushConsumerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosEventComm.PushConsumer s)
	{
		_out.write_Object(s);
	}
	public static CosEventComm.PushConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof CosEventComm.PushConsumer)
		{
			return (CosEventComm.PushConsumer)obj;
		}
		else if (obj._is_a("IDL:CosEventComm/PushConsumer:1.0"))
		{
			CosEventComm._PushConsumerStub stub;
			stub = new CosEventComm._PushConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static CosEventComm.PushConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof CosEventComm.PushConsumer)
		{
			return (CosEventComm.PushConsumer)obj;
		}
		else
		{
			CosEventComm._PushConsumerStub stub;
			stub = new CosEventComm._PushConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
