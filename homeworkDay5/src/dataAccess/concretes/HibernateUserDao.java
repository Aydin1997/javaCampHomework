package dataAccess.concretes;

import dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(String message) {
		System.out.println("Hibernate ile kullanıcı eklendi: " + message);

	}

	@Override
	public void delete(String message) {
		System.out.println("Hibernate ile kullanıcı silindi: " + message);

	}

	@Override
	public void update(String message) {
		System.out.println("Hibernate ile kullanıcı güncellendi: " + message);

	}

}
