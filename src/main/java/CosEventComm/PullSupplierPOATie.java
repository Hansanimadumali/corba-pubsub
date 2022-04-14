package CosEventComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PullSupplier".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public class PullSupplierPOATie
	extends PullSupplierPOA
{
	private PullSupplierOperations _delegate;

	private POA _poa;
	public PullSupplierPOATie(PullSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public PullSupplierPOATie(PullSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public CosEventComm.PullSupplier _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		CosEventComm.PullSupplier __r = CosEventComm.PullSupplierHelper.narrow(__o);
		return __r;
	}
	public CosEventComm.PullSupplier _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		CosEventComm.PullSupplier __r = CosEventComm.PullSupplierHelper.narrow(__o);
		return __r;
	}
	public PullSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PullSupplierOperations delegate)
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
	public void disconnect_pull_supplier()
	{
_delegate.disconnect_pull_supplier();
	}

	public org.omg.CORBA.Any pull() throws CosEventComm.Disconnected
	{
		return _delegate.pull();
	}

	public org.omg.CORBA.Any try_pull(org.omg.CORBA.BooleanHolder has_event) throws CosEventComm.Disconnected
	{
		return _delegate.try_pull(has_event);
	}

}
