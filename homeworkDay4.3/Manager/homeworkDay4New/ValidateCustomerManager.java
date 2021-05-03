package homeworkDay4New;

public class ValidateCustomerManager implements ValidateCustomer {

	@Override
	public boolean validate(Customer customer) {
		if (customer.getNationalityId().length() == 11 && !customer.getNationalityId().startsWith("0")
				&& customer.getName().length() > 0 && customer.getSurname().length() > 0) { // Tc Kontrol
			System.out.println("Sisteme Yönlendiriliyorsunuz..");
			return true;
		} else {
			System.out.println("Hatalý Giriþ");
			return false;
		}
	}
}
