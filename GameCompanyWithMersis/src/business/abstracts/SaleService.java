package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.User;

public interface SaleService {
	
	void saleWithCampaign(User user,Game game,Campaign campaign);
	void saleWithoutCampaign(User user,Game game);

}
