package CosEventComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PushSupplier".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public class PushSupplierPOATie
	extends PushSupplierPOA
{
	private PushSupplierOperations _delegate;

	private POA _poa;
	public PushSupplierPOATie(PushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public PushSupplierPOATie(PushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public CosEventComm.PushSupplier _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		CosEventComm.PushSupplier __r = CosEventComm.PushSupplierHelper.narrow(__o);
		return __r;
	}
	public CosEventComm.PushSupplier _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		CosEventComm.PushSupplier __r = CosEventComm.PushSupplierHelper.narrow(__o);
		return __r;
	}
	public PushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public void disconnect_push_supplier()
	{
_delegate.disconnect_push_supplier();
	}

}
