package homeworkDay4New;

public class Customer {

	private int id;
	private String name;
	private String surname;
	private int born;
	private String nationalityId;

	public Customer() {
		// Default
	}

	public Customer(int id, String name, String surname, int born, String nationalityId) { // Yapici
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.born = born;
		this.nationalityId = nationalityId;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getBorn() {
		return born;
	}

	public void setBorn(int born) {
		this.born = born;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
