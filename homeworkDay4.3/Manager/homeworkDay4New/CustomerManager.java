package homeworkDay4New;

public class CustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getId()+" Numaral� M��teri Eklendi: "+customer.getName()+" "+customer.getSurname());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getId()+" Numaral� M��teri Silindi: "+customer.getName()+" "+customer.getSurname());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getId()+" Numaral� M��teri G�ncellendi: "+customer.getName()+" "+customer.getSurname());
		
	
	}
	

}
