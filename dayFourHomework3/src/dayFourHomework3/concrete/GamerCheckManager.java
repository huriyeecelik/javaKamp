package dayFourHomework3.concrete;

import dayFourHomework3.abstracts.GamerCheckService;
import dayFourHomework3.entities.Gamer;

public class GamerCheckManager implements GamerCheckService{
	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return true;
	}
}
