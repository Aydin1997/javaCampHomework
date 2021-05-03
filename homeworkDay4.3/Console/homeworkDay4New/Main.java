package homeworkDay4New;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1=new Customer(1,"Aydýn","Þimþek",1997,"12345678910");
		Customer customer2=new Customer(2,"Eren","Þimþek",2005,"087654232110");
		
		Game game1=new Game(1,"Cs-GO",100,80);
		Game game2=new Game(2,"FIFA 2021",250,50);
		
		Campaign campaign1=new Campaign("Yaz Ýndirimi");
		Campaign campaign2=new Campaign("Kýþ Ýndirimi");
		
		//Kullanýcý Giriþ Kontrolü
		ValidateCustomerManager validateCustomerManager=new ValidateCustomerManager();
		validateCustomerManager.validate(customer1);
		
		ValidateCustomerManager validateCustomerManager2=new ValidateCustomerManager();
		validateCustomerManager2.validate(customer2);
		System.out.println("----------------------------------------------------");
		
		//Müþteri Ýþlemleri
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(customer1);
		customerManager.delete(customer2);
		System.out.println("----------------------------------------------------");
		
		//Oyun Ýþlemleri
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		gameManager.update(game2);
		System.out.println("----------------------------------------------------");
		
		//Satýþ Ýþlemleri
		SaleManager saleManager=new SaleManager();
		saleManager.sale(game2, customer2, campaign2);
		saleManager.sale(game1, customer1, campaign1);
		
		
	}

}
