package CosEventComm;


/**
 * Generated from IDL exception "Disconnected".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public abstract class DisconnectedHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(DisconnectedHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(CosEventComm.DisconnectedHelper.id(),"Disconnected",new org.omg.CORBA.StructMember[0]);
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final CosEventComm.Disconnected s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static CosEventComm.Disconnected extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:CosEventComm/Disconnected:1.0";
	}
	public static CosEventComm.Disconnected read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final CosEventComm.Disconnected result = new CosEventComm.Disconnected(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final CosEventComm.Disconnected s)
	{
		out.write_string(id());
	}
}
