package PublishSubscribe;


/**
 * Generated from IDL interface "Publisher".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public abstract class PublisherHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PublisherHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:PublishSubscribe/Publisher:1.0", "Publisher");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final PublishSubscribe.Publisher s)
	{
			any.insert_Object(s);
	}
	public static PublishSubscribe.Publisher extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:PublishSubscribe/Publisher:1.0";
	}
	public static Publisher read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(PublishSubscribe._PublisherStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final PublishSubscribe.Publisher s)
	{
		_out.write_Object(s);
	}
	public static PublishSubscribe.Publisher narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof PublishSubscribe.Publisher)
		{
			return (PublishSubscribe.Publisher)obj;
		}
		else if (obj._is_a("IDL:PublishSubscribe/Publisher:1.0"))
		{
			PublishSubscribe._PublisherStub stub;
			stub = new PublishSubscribe._PublisherStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static PublishSubscribe.Publisher unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof PublishSubscribe.Publisher)
		{
			return (PublishSubscribe.Publisher)obj;
		}
		else
		{
			PublishSubscribe._PublisherStub stub;
			stub = new PublishSubscribe._PublisherStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
