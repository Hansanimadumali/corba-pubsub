package CosEventComm;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PushConsumer".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public class PushConsumerPOATie
	extends PushConsumerPOA
{
	private PushConsumerOperations _delegate;

	private POA _poa;
	public PushConsumerPOATie(PushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public PushConsumerPOATie(PushConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public CosEventComm.PushConsumer _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		CosEventComm.PushConsumer __r = CosEventComm.PushConsumerHelper.narrow(__o);
		return __r;
	}
	public CosEventComm.PushConsumer _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		CosEventComm.PushConsumer __r = CosEventComm.PushConsumerHelper.narrow(__o);
		return __r;
	}
	public PushConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PushConsumerOperations delegate)
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

	public void push(org.omg.CORBA.Any data) throws CosEventComm.Disconnected
	{
_delegate.push(data);
	}

}
