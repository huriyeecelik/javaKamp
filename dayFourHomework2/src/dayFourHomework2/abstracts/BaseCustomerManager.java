package dayFourHomework2.abstracts;

import dayFourHomework2.entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Veri tabanýna kaydedildi : " + customer.getFirstName());

	}

}
