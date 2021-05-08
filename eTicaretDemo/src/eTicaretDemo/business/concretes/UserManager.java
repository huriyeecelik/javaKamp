package eTicaretDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.core.abstracts.EmailService;
import eTicaretDemo.core.abstracts.GoogleService;
import eTicaretDemo.core.concretes.Utils;
import eTicaretDemo.core.concretes.Validation;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao dao;
	private GoogleService googleService;
	private EmailService emailService;
	private List<User> users = new ArrayList<>();

	public UserManager(UserDao dao, GoogleService googleService, EmailService emailService) {
		this.dao = dao;
		this.googleService = googleService;
		this.emailService = emailService;
	}

	@Override
	public void add(User user) {
		if (check(user)) {
			users.add(user);
			if (checkEmailExist(user.getEmail())) {
				dao.add(user);
				emailService.sendEmail(user.getEmail());
				isActivated();
			}
		}

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
		return dao.getAll();
	}

	@Override
	public boolean checkEmailExist(String email) {
		users = getAll();
		for (User user : users) {
			if (user.getEmail().equals(email)) {
				System.out.println("Böyle bir mail mevcut : " + user.getEmail());
				return false;
			}
		}
		return true;

	}

	private boolean check(User user) {
		if (!Validation.isNull(user.getFirstName(), "Ad alaný boþ geçilemez")) {
			return false;
		}
		if (!Validation.isNull(user.getLastName(), "Soyad alaný boþ geçilemez")) {
			return false;
		}
		if (!Validation.isNull(user.getEmail(), "Email alaný boþ geçilemez")) {
			return false;
		}
		if (!Validation.isNull(user.getPassword(), "Password alaný boþ geçilemez")) {
			return false;
		}
		if (!Utils.emailKontrol(user.getEmail())) {
			return false;
		}
		if (!Validation.minLength(user.getFirstName(), 2, "Ad alaný en az 2 karakter olmalýdýr")) {
			return false;
		}
		if (!Validation.minLength(user.getLastName(), 2, "Soyad alaný en az 2 karakter olmalýdýr")) {
			return false;
		}
		if (!Validation.minLength(user.getPassword(), 6, "Þifre alaný en az 6 karakter olmalýdýr")) {
			return false;
		}
		if (!googleService.registerToSystem(user)) {
			return false;
		}
		return true;
	}

	@Override
	public void isActivated() {
		System.out.println("Hesap Doðrulandý");

	}

	@Override
	public void login(String password, String email) {
		List<User> users = new ArrayList<User>();
		users = getAll();
		if (isCheck(password, email)) {
			for (User user : users) {
				if (user.getPassword().equals(password) && user.getEmail().equals(email)) {
					System.out.println("Giriþ Baþarýlý");
				} else {
					System.out.println("Email veya password hatalý!");
				}
			}
		}

	}

	private boolean isCheck(String password, String email) {
		if (!Validation.isNull(email, "Email alaný boþ geçilemez")) {
			return false;
		}
		if (!Validation.isNull(password, "Password alaný boþ geçilemez")) {
			return false;
		}
		if (!Validation.minLength(password, 6, "Þifre alaný en az 6 karakter olmalýdýr")) {
			return false;
		}
		if (!Utils.emailKontrol(email)) {
			return false;
		}
		return true;

	}
}
