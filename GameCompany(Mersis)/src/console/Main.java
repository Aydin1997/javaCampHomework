package console;

import business.concretes.CampaignManager;
import business.concretes.GameManager;
import business.concretes.SaleManager;
import business.concretes.UserManager;
import core.LoggerManagerAdapter;
import core.MersisManagerAdapter;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) throws Exception {
		
		User user1=new User("Aydýn","Þimþek",1997,44215944902L);
		User user2=new User("Eren","Þimþek",2005,23132132L);
		UserManager userManager=new UserManager(new MersisManagerAdapter(),new LoggerManagerAdapter());
		userManager.add(user1);
		
		System.out.println("-----------------------------------------------------------------------");
		
		Game game1=new Game("Cs-Go",100);
		Game game2=new Game("FIFA 2021",300,50);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		gameManager.delete(game1);
		gameManager.update(game2);
		
		System.out.println("-----------------------------------------------------------------------");
		
		Campaign campaign=new Campaign("Yaz indirimleri");
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		
		System.out.println("-----------------------------------------------------------------------");
		
		SaleManager saleManager=new SaleManager();
		saleManager.saleWithCampaign(user1, game2, campaign);
		saleManager.saleWithoutCampaign(user2, game1);
		
	
	
	
	}

}
