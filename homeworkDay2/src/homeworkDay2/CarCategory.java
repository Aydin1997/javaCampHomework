package homeworkDay2;

public class CarCategory {
	int id;
	String type;
	
	
	public CarCategory() {
		System.out.println("I'm ready to work!");
	}
	
	
	public CarCategory(int id,String type) {
		// this(); ile default "I'm ready to work!"
		this.id=id;
		this.type=type;
		
	}
}
