package PublishSubscribe;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Publisher".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public class PublisherPOATie
	extends PublisherPOA
{
	private PublisherOperations _delegate;

	private POA _poa;
	public PublisherPOATie(PublisherOperations delegate)
	{
		_delegate = delegate;
	}
	public PublisherPOATie(PublisherOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public PublishSubscribe.Publisher _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		PublishSubscribe.Publisher __r = PublishSubscribe.PublisherHelper.narrow(__o);
		return __r;
	}
	public PublishSubscribe.Publisher _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		PublishSubscribe.Publisher __r = PublishSubscribe.PublisherHelper.narrow(__o);
		return __r;
	}
	public PublisherOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PublisherOperations delegate)
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
