package CosEventComm;


/**
 * Generated from IDL interface "PullConsumer".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public abstract class PullConsumerHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PullConsumerHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:CosEventComm/PullConsumer:1.0", "PullConsumer");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final CosEventComm.PullConsumer s)
	{
			any.insert_Object(s);
	}
	public static CosEventComm.PullConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:CosEventComm/PullConsumer:1.0";
	}
	public static PullConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(CosEventComm._PullConsumerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final CosEventComm.PullConsumer s)
	{
		_out.write_Object(s);
	}
	public static CosEventComm.PullConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof CosEventComm.PullConsumer)
		{
			return (CosEventComm.PullConsumer)obj;
		}
		else if (obj._is_a("IDL:CosEventComm/PullConsumer:1.0"))
		{
			CosEventComm._PullConsumerStub stub;
			stub = new CosEventComm._PullConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static CosEventComm.PullConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof CosEventComm.PullConsumer)
		{
			return (CosEventComm.PullConsumer)obj;
		}
		else
		{
			CosEventComm._PullConsumerStub stub;
			stub = new CosEventComm._PullConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
