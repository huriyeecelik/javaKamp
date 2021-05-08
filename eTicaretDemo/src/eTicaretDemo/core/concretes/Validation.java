package eTicaretDemo.core.concretes;

public class Validation {
	public static boolean minLength(String value, int minLength, String message) {
		if (value.length() < minLength) {
			System.out.println(message);
			return false;
		}
		return true;
	}

	public static boolean isNull(String str,String message) {
		if (str.isEmpty() || str.equals(null)) {
			System.out.println(message);
			return false;
		}
		return true;
	}
}
