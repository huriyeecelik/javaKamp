package eTicaretDemo.core.concretes;

import eTicaretDemo.core.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void sendEmail(String email) {
			System.out.println("Doðrulama kodu mail olarak gönderildi.");
			System.out.println("Mail adresini doðrulamak için bu linke týklayýnýz. ");
	}


}
