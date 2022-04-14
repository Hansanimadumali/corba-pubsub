package CosEventComm;


/**
 * Generated from IDL interface "PullSupplier".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 13, 2022 3:57:34 PM
 */

public interface PullSupplierOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Any pull() throws CosEventComm.Disconnected;
	org.omg.CORBA.Any try_pull(org.omg.CORBA.BooleanHolder has_event) throws CosEventComm.Disconnected;
	void disconnect_pull_supplier();
}
