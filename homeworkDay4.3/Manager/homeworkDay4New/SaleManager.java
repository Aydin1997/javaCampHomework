package homeworkDay4New;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Customer customer, Campaign campaign) {
		System.out.println(game.getName() + " isimli oyun " + customer.getName() + " taraf�ndan "
				+ campaign.getCampaignName() + " kampanya sezonunda sat�n al�nd�.");
		System.out.println("Oyun Eski Fiyat�: " + game.getPrice() + " TL" + " Oyun Yeni Fiyat�: "
				+ game.getAfterDiscountPrice() + " TL");
		System.out.println("Uygulanan indirim %" + game.getDiscount());

	}

}
