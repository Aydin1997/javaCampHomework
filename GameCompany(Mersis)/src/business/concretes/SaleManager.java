package business.concretes;

import business.abstracts.SaleService;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.User;

public class SaleManager implements SaleService {

	@Override
	public void saleWithCampaign(User user, Game game, Campaign campaign) {

		System.out.println(user.getFirstName() + " isimli oyuncu " + game.getGameName() + " oyununu "
				+ campaign.getCampaignName() + " " + "kampanyas� ile sat�n alm��t�r.");
		System.out.println("Uygulanan �ndirim:%" + game.getDiscount());
		System.out.println("Eski Fiyat: " + game.getPrice()+"TL " + "=>" + " Yeni Fiyat: " + game.getPriceAfterDiscount()+"TL");

	}

	@Override
	public void saleWithoutCampaign(User user, Game game) {
		
		System.out.println(user.getFirstName() + " isimli oyuncu " + game.getGameName() + " oyununu "
				+ "kampanyas�z "+game.getPrice()+"TL"+" fiyata sat�n alm��t�r.");

	}

}
