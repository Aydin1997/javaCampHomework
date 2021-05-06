package console;

import business.concretes.UserManager;
import core.GoogleManagerAdapter;
import dataAccess.concretes.DataBaseUserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Aydýn", "Þimþek", "aydin01@gmail.com", "123456");

		UserManager userManager = new UserManager(new DataBaseUserDao(), new GoogleManagerAdapter());

		// Kayit Ýslemleri
		userManager.register(user1);

		System.out.println("*************************************************************");

		// Giris islemleri
		userManager.login("aydin01@gmail.com", "123456");

	}

}
