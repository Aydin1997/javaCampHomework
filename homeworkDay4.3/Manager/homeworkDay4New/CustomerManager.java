package homeworkDay4New;

public class CustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getId()+" Numaralý Müþteri Eklendi: "+customer.getName()+" "+customer.getSurname());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getId()+" Numaralý Müþteri Silindi: "+customer.getName()+" "+customer.getSurname());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getId()+" Numaralý Müþteri Güncellendi: "+customer.getName()+" "+customer.getSurname());
		
	
	}
	

}
