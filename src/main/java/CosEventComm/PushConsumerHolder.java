package CosEventComm;

/**
 * Generated from IDL interface "PushConsumer".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public final class PushConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public PushConsumer value;
	public PushConsumerHolder()
	{
	}
	public PushConsumerHolder (final PushConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PushConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PushConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PushConsumerHelper.write (_out,value);
	}
}
