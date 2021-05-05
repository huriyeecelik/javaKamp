package dayFourHomework3.adapters;

import dayFourHomework3.abstracts.GamerCheckService;
import dayFourHomework3.entities.Gamer;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		System.out.println("Ki�i do�ruland� : " + gamer.getFirstName() + " " + gamer.getLastName());
		return true;

	}

}
