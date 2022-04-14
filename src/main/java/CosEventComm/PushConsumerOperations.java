package CosEventComm;


/**
 * Generated from IDL interface "PushConsumer".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public interface PushConsumerOperations
{
	/* constants */
	/* operations  */
	void push(org.omg.CORBA.Any data) throws CosEventComm.Disconnected;
	void disconnect_push_consumer();
}
