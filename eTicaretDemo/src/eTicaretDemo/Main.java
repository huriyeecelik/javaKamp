package eTicaretDemo;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.business.concretes.UserManager;
import eTicaretDemo.core.concretes.EmailManager;
import eTicaretDemo.core.concretes.GoogleAccountAdaptor;
import eTicaretDemo.dataAccess.concretes.hibernateUserDao;
import eTicaretDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new hibernateUserDao(), new GoogleAccountAdaptor(),
				new EmailManager());
		User user = new User(1, "Huriye", "Çelik", "huriye@gmail.com", "123456");
		userService.add(user);
//		User user2 = new User(2, "Deneme", "Çelik", "huriye@gmail.com", "145874");
//		userService.add(user2);

		userService.login(user.getPassword(), user.getEmail());
	}

}
