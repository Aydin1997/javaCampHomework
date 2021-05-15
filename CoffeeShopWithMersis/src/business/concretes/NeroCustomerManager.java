package business.concretes;

import business.abstracts.CustomerService;

import entities.concretes.Customer;

public class NeroCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db: "+customer.getFirstName());
		
	}
	
	

}
