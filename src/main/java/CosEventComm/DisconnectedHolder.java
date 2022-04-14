package CosEventComm;

/**
 * Generated from IDL exception "Disconnected".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public final class DisconnectedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public CosEventComm.Disconnected value;

	public DisconnectedHolder ()
	{
	}
	public DisconnectedHolder(final CosEventComm.Disconnected initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CosEventComm.DisconnectedHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = CosEventComm.DisconnectedHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		CosEventComm.DisconnectedHelper.write(_out, value);
	}
}
