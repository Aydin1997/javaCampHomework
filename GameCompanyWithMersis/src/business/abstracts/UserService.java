package business.abstracts;

import java.rmi.RemoteException;

import entities.concretes.User;

public interface UserService {
	
	void add(User user) throws RemoteException, Exception;
	void delete(User user);
	void update(User user);

}
