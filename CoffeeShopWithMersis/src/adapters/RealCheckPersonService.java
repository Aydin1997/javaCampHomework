package adapters;

import java.rmi.RemoteException;

import entities.concretes.Customer;

public interface RealCheckPersonService {
	
	boolean validate(Customer customer) throws RemoteException;

}
