package eTicaretDemo.core.concretes;

import eTicaretDemo.core.abstracts.GoogleService;
import eTicaretDemo.entities.concretes.User;
import eTicaretDemo.google.GoogleAccountManager;

public class GoogleAccountAdaptor implements GoogleService {

	@Override
	public boolean registerToSystem(User user) {
		boolean b = false;
		GoogleAccountManager manager = new GoogleAccountManager();
		if (manager.register(user)) {
			System.out.println("Geçerli hesap");
			b = true;
		} else {
			System.out.println("Geçersiz hesap");
			b = false;
		}
		return b;
	}

}
