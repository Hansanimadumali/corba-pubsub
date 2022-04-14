package PublishSubscribe;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Subscriber".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public class SubscriberPOATie
	extends SubscriberPOA
{
	private SubscriberOperations _delegate;

	private POA _poa;
	public SubscriberPOATie(SubscriberOperations delegate)
	{
		_delegate = delegate;
	}
	public SubscriberPOATie(SubscriberOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public PublishSubscribe.Subscriber _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		PublishSubscribe.Subscriber __r = PublishSubscribe.SubscriberHelper.narrow(__o);
		return __r;
	}
	public PublishSubscribe.Subscriber _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		PublishSubscribe.Subscriber __r = PublishSubscribe.SubscriberHelper.narrow(__o);
		return __r;
	}
	public SubscriberOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SubscriberOperations delegate)
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
	public void disconnect_push_consumer()
	{
_delegate.disconnect_push_consumer();
	}

	public int min()
	{
		return _delegate.min();
	}

	public int max()
	{
		return _delegate.max();
	}

	public void push(org.omg.CORBA.Any data) throws CosEventComm.Disconnected
	{
_delegate.push(data);
	}

}
