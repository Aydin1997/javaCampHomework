package business.concretes;

import java.util.ArrayList;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import core.JGoogleService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private JGoogleService jGoogleService;

	public UserManager(UserDao userDao, JGoogleService jGoogleService) {
		super();
		this.userDao = userDao;
		this.jGoogleService = jGoogleService;
	}

	public static boolean isEmailValid(String email) { // Email control
		final Pattern EMAIL_REGEX = Pattern.compile(
				"[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
				Pattern.CASE_INSENSITIVE);
		return EMAIL_REGEX.matcher(email).matches();
	}

	public static boolean isEmailValidOnClick() { // Tiklama onayi
		return true;
	}

	ArrayList<String> emailList = new ArrayList<String>(); // Maillerin tutuldugu liste
	ArrayList<String> passwordList = new ArrayList<String>(); // Passwordlarýn tutuldugu liste

	@Override
	public void register(User user) {

		if (user.getPassword().length() < 6) { // Password Check
			System.out.println("Girilen þifre en az 6 karakterli olmalýdýr. Lütfen tekrar deneyiniz.");
			return;
		}
		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) { // FirstName and Lastname Check
			System.out.println("Girilen isim veya soyisim hatalý.");
			return;
		}
		if (isEmailValid(user.getEmail()) != true) { // Email control
			System.out.println("Girilen mail adresini kontrol ediniz.");
			return;
		}

		if (emailList.contains(user.getEmail())) { // Mail control(Don't repeat)
			System.out.println("Bu mail adresi ile üyelik alýnmýþ. Lütfen baþka bir mail adresi deneyiniz.");
			return;
		} else {
			
			if (isEmailValidOnClick() != true) { // Validate email
				System.out.println("Lütfen mail adresinizi doðrulayýnýz.");
				return;
			} else {
				System.out.println("Kayýt iþlemi baþarýlý bir þekilde tamamlandý.");
				userDao.add(user.getEmail());
				jGoogleService.sendGoogleMessage(user.getEmail() + "\n");
				emailList.add(user.getEmail()); // Girilen email listeye eklendi!
				passwordList.add(user.getPassword()); // Girilen þifre listeye eklendi!
			}
		}

	}

	@Override
	public void login(String email, String password) {
		if (emailList.contains(email) && passwordList.contains(password)) {
			System.out.println("Giriþ iþlemi baþarý ile tamamlandý..");
		} else {
			System.out.println("Mail adresi veya þifre hatalý.");
		}

	}

}
