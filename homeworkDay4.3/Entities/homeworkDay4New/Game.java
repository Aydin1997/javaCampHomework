package homeworkDay4New;

public class Game {

	private int id;
	private String name;
	private double price;
	private int discount;
	

	public Game() {

	}

	public Game(int id, String name, double price, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getAfterDiscountPrice() {
		return this.price - (this.price * this.discount / 100);
	}
}
