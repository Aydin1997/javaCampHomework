package dataAccess.concretes;

import dataAccess.abstracts.UserDao;

public class DataBaseUserDao implements UserDao {

	@Override
	public void add(String message) {
		System.out.println("Db ile user eklendi: "+message);
		
	}

	@Override
	public void delete(String message) {
		System.out.println("Db ile user silindi: "+message);
		
	}

	@Override
	public void update(String message) {
		System.out.println("Db ile user güncellendi: "+message);
		
	}

}
