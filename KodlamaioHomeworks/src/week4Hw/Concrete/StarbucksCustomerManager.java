package week4Hw.Concrete;

import week4Hw.Abstract.BaseCustomerManager;
import week4Hw.Abstract.ICustomerCheckService;
import week4Hw.Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{

private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.checkIfRealPerson(customer)) {
			
			super.save(customer);
			
		} else {
			
			System.out.println("Not a valid person!");
		}
		
	}
	
	

}
