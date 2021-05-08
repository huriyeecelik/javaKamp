package eTicaretDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class hibernateUserDao implements UserDao {

	private List<User> users=new ArrayList<User>();
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + " adlý kullanýcý sisteme baþarýyla kayýt oldu");
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
