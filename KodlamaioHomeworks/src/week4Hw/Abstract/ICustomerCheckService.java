package week4Hw.Abstract;

import week4Hw.Entities.Customer;

public interface ICustomerCheckService {

	boolean checkIfRealPerson(Customer customer);
}
