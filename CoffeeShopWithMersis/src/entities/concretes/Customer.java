package entities.concretes;

import entities.abstracts.Entity;

public class Customer implements Entity{
	
	private int id;
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private long nationalityId;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, int yearOfBirth, long nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getyearOfBirth() {
		return yearOfBirth;
	}

	public void setyearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}

}
