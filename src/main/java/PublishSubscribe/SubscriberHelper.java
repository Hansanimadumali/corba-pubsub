package PublishSubscribe;


/**
 * Generated from IDL interface "Subscriber".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public abstract class SubscriberHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SubscriberHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:PublishSubscribe/Subscriber:1.0", "Subscriber");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final PublishSubscribe.Subscriber s)
	{
			any.insert_Object(s);
	}
	public static PublishSubscribe.Subscriber extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:PublishSubscribe/Subscriber:1.0";
	}
	public static Subscriber read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(PublishSubscribe._SubscriberStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final PublishSubscribe.Subscriber s)
	{
		_out.write_Object(s);
	}
	public static PublishSubscribe.Subscriber narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof PublishSubscribe.Subscriber)
		{
			return (PublishSubscribe.Subscriber)obj;
		}
		else if (obj._is_a("IDL:PublishSubscribe/Subscriber:1.0"))
		{
			PublishSubscribe._SubscriberStub stub;
			stub = new PublishSubscribe._SubscriberStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static PublishSubscribe.Subscriber unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof PublishSubscribe.Subscriber)
		{
			return (PublishSubscribe.Subscriber)obj;
		}
		else
		{
			PublishSubscribe._SubscriberStub stub;
			stub = new PublishSubscribe._SubscriberStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
