package dayFourHomework3.abstracts;

import java.util.List;

import dayFourHomework3.entities.Game;

public interface GameService {
	void save(Game game);

	void update(Game game);

	void delete(Game game);

	List<Game> getAll();
}
