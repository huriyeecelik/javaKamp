package dayFourHomework2;

import java.time.LocalDate;

import dayFourHomework2.abstracts.BaseCustomerManager;
import dayFourHomework2.adapters.MernisServiceAdapter;
import dayFourHomework2.concrete.StarbucksCustomerManager;
import dayFourHomework2.entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "Huriye", "Çelik", LocalDate.of(1995, 2, 21), "12345678912");
		baseCustomerManager.save(customer);

	}

}
