package week4Hw.Concrete;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import week4Hw.Abstract.ICustomerCheckService;
import week4Hw.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		
		return false;
		
		
	}

}
