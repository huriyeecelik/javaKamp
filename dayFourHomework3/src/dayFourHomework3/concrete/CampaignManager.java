package dayFourHomework3.concrete;

import dayFourHomework3.abstracts.CampaignService;
import dayFourHomework3.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void save(Campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getName() + " %" + campaign.getDiscount());

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi : " + campaign.getName() + " %" + campaign.getDiscount());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getName());

	}

}
