package eTicaretDemo.core.concretes;

import eTicaretDemo.core.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void sendEmail(String email) {
			System.out.println("Do�rulama kodu mail olarak g�nderildi.");
			System.out.println("Mail adresini do�rulamak i�in bu linke t�klay�n�z. ");
	}


}
