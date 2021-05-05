package dayFourHomework3.abstracts;

import dayFourHomework3.entities.Campaign;

public interface CampaignService {
	void save(Campaign campaign);

	void update(Campaign campaign);

	void delete(Campaign campaign);
}
