package dayFourHomework3.concrete;

import dayFourHomework3.abstracts.SaleService;
import dayFourHomework3.entities.Campaign;
import dayFourHomework3.entities.Game;
import dayFourHomework3.entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getName() + " adlý oyun " + game.getPrice() + " TL'ye " + gamer.getUserName()
				+ " kullanýcýsýna satýldý. ");

	}

	@Override
	public void saleCompaign(Game game, Gamer gamer, Campaign campaign) {
		double priceCampaign = game.getPrice() - (game.getPrice() * ((double) campaign.getDiscount() / 100));
		System.out.println(game.getName() + " adlý oyun " + gamer.getUserName() + " kullanýcýsýna  "
				+ campaign.getName() + " kampanyasýyla " + priceCampaign + " TL'ye satýldý.");
	}

}
