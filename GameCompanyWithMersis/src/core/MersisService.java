package core;

import java.rmi.RemoteException;

import entities.concretes.User;

public interface MersisService {
	
	boolean validate(User user) throws RemoteException;

}
