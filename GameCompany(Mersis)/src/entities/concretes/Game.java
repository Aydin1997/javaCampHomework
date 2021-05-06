package entities.concretes;

import entities.abstracts.Entity;

public class Game implements Entity{
	
	private String gameName;
	private double price;
	private double discount;
	
	
	public Game() {
		
	}
	public Game(String gameName, double price) { //Ýndirimsiz Constructor
		super();
		this.gameName = gameName;
		this.price = price;
		
	}
	public Game(String gameName, double price, double discount) {
		super();
		this.gameName = gameName;
		this.price = price;
		this.discount = discount;
		
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getPriceAfterDiscount() { //Ýndirim sonrasý fiyat
		return this.price-(this.price*this.discount/100);
	}
	

}
