package homeworkDay2;

public class Main {

	public static void main(String[] args) {
		CarField carField1=new CarField(001,2017,"Ford",75,4,70000);
		CarField carField2=new CarField(002,2019,"BMW",120,2,350000);
		CarField carField3=new CarField(003,2021,"Mercedes",150,4,500000);
		
		
		
		CarField[] carFields= {carField1,carField2,carField3};
		System.out.println("Listede ki Araçlar Yükleniyor!!");
		for(CarField carField:carFields) {
			System.out.println("\nAraç id:"+carField.id);
			System.out.println("Araç Model:"+carField.model);
			System.out.println("Araç Yil:"+carField.year);
			System.out.println("Motor Gücü:"+carField.motorPower+"HP");
			System.out.println("Kapi Sayisi:"+carField.doors);
			System.out.println("Fiyat:"+carField.price+"TL");
			
			
		}
		
		CarCategory carCategory1=new CarCategory(7001,"Hatchback");
		CarCategory carCategory2=new CarCategory(7002,"Sedan");
		CarCategory carCategory3=new CarCategory(7003,"Jeep");
		
		System.out.println("\n");
		CarManager carManager=new CarManager();
		carManager.carAdd(carField1, carCategory1);
		carManager.carAdd(carField2, carCategory2);
		carManager.carAdd(carField3, carCategory3);
		
		System.out.println("\n");
		carManager.carRemove(carField1);
		carManager.carRemove(carField2);
		carManager.carRemove(carField3);
		
		System.out.println("\n");
		carManager.carStar(carField1);
		carManager.carStar(carField2);
		carManager.carStar(carField3);

	
	}

}
