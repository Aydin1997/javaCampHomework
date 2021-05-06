package business.concretes;

import java.rmi.RemoteException;
import business.abstracts.UserService;
import core.LoggerService;
import core.MersisService;
import entities.concretes.User;

public class UserManager implements UserService {

	private MersisService mersisService;
	private LoggerService loggerService;

	public UserManager(MersisService mersisService,LoggerService loggerService) {
		super();
		this.mersisService = mersisService;
		this.loggerService=loggerService;
	}

	@Override
	public void add(User user) throws Exception {

		if (mersisService.validate(user)) {
			System.out.println("Baþarýlý Giriþ Saðlandý!");
			System.out.println(user.getFirstName()+" "+user.getLastName()+" sisteme yönlendiriliyorsunuz..");
			loggerService.logToMessage(user.getLastName());
		} else {
			throw new Exception("Baþarýsýz Giriþ");
		}

	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý Silindi.");

	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý Güncellendi.");

	}

}
