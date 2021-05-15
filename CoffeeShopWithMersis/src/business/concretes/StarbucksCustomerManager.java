package business.concretes;

import adapters.RealCheckPersonService;
import business.abstracts.CustomerService;
import entities.concretes.Customer;

public class StarbucksCustomerManager implements CustomerService {

	private RealCheckPersonService realCheckPerson;

	public StarbucksCustomerManager(RealCheckPersonService realCheckPerson) {
		super();
		this.realCheckPerson = realCheckPerson;
	}

	@Override
	public void save(Customer customer) throws Exception {
		
		if(realCheckPerson.validate(customer)) {
			System.out.println("Saved to db: "+customer.getFirstName());
		}else {
			throw new Exception("Hatalý");
		}
	}

}
