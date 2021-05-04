package week4Hw;

import java.time.LocalDate;
import week4Hw.Abstract.BaseCustomerManager;
import week4Hw.Adapters.MernisServiceAdapter;
import week4Hw.Concrete.NeroCustomerManager;
import week4Hw.Concrete.StarbucksCustomerManager;
import week4Hw.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager starbuckscustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbuckscustomerManager.save(new Customer(1,"Burak","Koç",LocalDate.of(2002, 10, 27),"11"));
		
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(new Customer(1,"Berk","Koç",LocalDate.of(2002, 10, 27),"25462"));
		
	}

}
