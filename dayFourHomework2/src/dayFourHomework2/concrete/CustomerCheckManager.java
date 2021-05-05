package dayFourHomework2.concrete;

import dayFourHomework2.abstracts.ICustomerCheckService;
import dayFourHomework2.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
