package dayFourHomework3.concrete;

import dayFourHomework3.abstracts.GamerCheckService;
import dayFourHomework3.abstracts.GamerService;
import dayFourHomework3.entities.Gamer;

public class GamerManager implements GamerService {
	GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void save(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Kiþi kaydedildi : " + gamer.getFirstName()+ " " + gamer.getLastName());
		} else {
			System.out.println("Geçerli bir kiþi deðil");
		}

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kiþi güncellendi : " + gamer.getFirstName()+ " " + gamer.getLastName());

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kiþi silindi : " + gamer.getFirstName()+ " " + gamer.getLastName());

	}

}
