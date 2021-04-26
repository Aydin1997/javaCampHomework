package homeworkDay2;

public class CarField {
	int id;
	int year;
	String model;
	double motorPower;
	int doors;
	int price;

	public CarField() {
		System.out.println("I'm ready to work!");
	}
	
	
	
	public CarField(int id,int year,String model,double motorPower,int doors,int price) {
		
		this.id=id;
		this.year=year;
		this.model=model;
		this.motorPower=motorPower;
		this.doors=doors;
		this.price=price;
		
	}

}
