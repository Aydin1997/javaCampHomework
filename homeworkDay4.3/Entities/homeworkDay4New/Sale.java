package homeworkDay4New;

public class Sale {
	
	private int id;
	private int gameId;
	private int customerId;
	
	public Sale() {
		
	}
	
	public Sale(int id, int gameId, int customerId) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.customerId = customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	

}
