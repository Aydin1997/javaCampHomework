package homeworkDay4New;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Customer customer, Campaign campaign) {
		System.out.println(game.getName() + " isimli oyun " + customer.getName() + " tarafýndan "
				+ campaign.getCampaignName() + " kampanya sezonunda satýn alýndý.");
		System.out.println("Oyun Eski Fiyatý: " + game.getPrice() + " TL" + " Oyun Yeni Fiyatý: "
				+ game.getAfterDiscountPrice() + " TL");
		System.out.println("Uygulanan indirim %" + game.getDiscount());

	}

}
