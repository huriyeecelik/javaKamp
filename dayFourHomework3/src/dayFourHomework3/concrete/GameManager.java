package dayFourHomework3.concrete;

import java.util.List;

import dayFourHomework3.abstracts.GameService;
import dayFourHomework3.entities.Game;


public class GameManager implements GameService {

	@Override
	public void save(Game game) {
		System.out.println("Oyun eklendi : " + game.getName() + " Fiyat� : " + game.getPrice());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun g�ncellendi : " + game.getName() + " Fiyat� : " + game.getPrice());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi : " + game.getName());
	}

	@Override
	public List<Game> getAll() {
		System.out.println("Oyunlar Listelendi : ");
		return null;
	}

}
