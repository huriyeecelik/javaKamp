package eTicaretDemo.business.abstracts;

import java.util.List;

import eTicaretDemo.entities.concretes.User;

public interface UserService {
	void add(User user);

	void update(User user);

	void delete(User user);

	List<User> getAll();

	boolean checkEmailExist(String email);

	void isActivated();

	void login(String password, String email);
}
