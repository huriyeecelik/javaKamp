package dayFourHomework3;

import java.time.LocalDate;

import dayFourHomework3.abstracts.CampaignService;
import dayFourHomework3.abstracts.GameService;
import dayFourHomework3.abstracts.GamerService;
import dayFourHomework3.abstracts.SaleService;
import dayFourHomework3.adapters.MernisServiceAdapter;
import dayFourHomework3.concrete.CampaignManager;
import dayFourHomework3.concrete.GameManager;
import dayFourHomework3.concrete.GamerManager;
import dayFourHomework3.concrete.SaleManager;
import dayFourHomework3.entities.Campaign;
import dayFourHomework3.entities.Game;
import dayFourHomework3.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		GamerService gamerService = new GamerManager(new MernisServiceAdapter());
		Gamer gamer = new Gamer(1, "Huriye", "Çelik", LocalDate.of(1995, 2, 21), "12345678912", "huriyecelik");
		gamerService.save(gamer);

		Gamer gamer2 = new Gamer(1, "Arif", "Çelik", LocalDate.of(1998, 4, 19), "12345678913", "arifcelik");
		gamerService.save(gamer2);

		GameService gameService = new GameManager();
		Game game = new Game(1, "Abc" + " --> ", 110);
		gameService.save(game);

		CampaignService campaignService = new CampaignManager();
		Campaign campaign = new Campaign(1, "Size Özel ", 15);
		campaignService.save(campaign);

		SaleService saleService = new SaleManager();
		saleService.sale(game, gamer);
		saleService.saleCompaign(game, gamer2, campaign);

	}

}
