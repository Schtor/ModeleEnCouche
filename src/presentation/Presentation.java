package presentation;

import model.Customer;
import service.CustomerService;
import service.ServiceImplementation;

public class Presentation {

	public static void main(String[] args) {
	
		// Initialisations 
		CustomerService cs = new ServiceImplementation();

		Customer c1 = new Customer("Ihab");
		Customer c2 = null;
		Customer c3 = new Customer("Michael Jordan");

				
		// Scenario 
		
		cs.addCustomer(c1);
		cs.addCustomer(c2);
		cs.addCustomer(c3);
		Customer c4 = cs.findValidatedCustomer(0);
		System.out.println(c4);
 		System.out.println(cs.getAllCustomer());
	}

}
