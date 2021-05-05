package dayFourHomework3.abstracts;

import dayFourHomework3.entities.Gamer;

public interface GamerService {
	void save(Gamer gamer);

	void update(Gamer gamer);

	void delete(Gamer gamer);
}
