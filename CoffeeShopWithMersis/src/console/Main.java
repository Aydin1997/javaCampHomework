package console;

import adapters.RealCheckPersonMersisManager;
import adapters.RealCheckPersonService;
import business.concretes.StarbucksCustomerManager;
import entities.concretes.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		RealCheckPersonService realCheckPersonService=new RealCheckPersonMersisManager();
		
		Customer customer=new Customer(1,"Aydýn","Þimþek",1997,44215944902L);
		StarbucksCustomerManager starbucksCustomerManager=new StarbucksCustomerManager(realCheckPersonService);
		starbucksCustomerManager.save(customer);

	}

}
