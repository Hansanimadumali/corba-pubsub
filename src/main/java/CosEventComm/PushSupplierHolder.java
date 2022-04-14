package CosEventComm;

/**
 * Generated from IDL interface "PushSupplier".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public final class PushSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public PushSupplier value;
	public PushSupplierHolder()
	{
	}
	public PushSupplierHolder (final PushSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PushSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PushSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PushSupplierHelper.write (_out,value);
	}
}
