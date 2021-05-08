package eTicaretDemo.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretDemo.entities.concretes.User;

public class Utils {

	private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern
			.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public static boolean emailKontrol(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		if (!matcher.matches()) {
			System.out.println("Email formatý yanlýþ");
			return false;
		}
		return true;
	}
	
	
}
