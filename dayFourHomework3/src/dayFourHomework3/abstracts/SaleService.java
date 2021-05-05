package dayFourHomework3.abstracts;

import dayFourHomework3.entities.Campaign;
import dayFourHomework3.entities.Game;
import dayFourHomework3.entities.Gamer;

public interface SaleService {

	void sale(Game game, Gamer gamer);

	void saleCompaign(Game game, Gamer gamer,Campaign campaign);

}
