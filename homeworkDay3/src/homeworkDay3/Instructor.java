package homeworkDay3;

public class Instructor extends User {
	
	private String branch;
	private String instructorId; 
	private String instructorPassword; 
	
	public Instructor(){
		
		}

	public Instructor(String firstName,String lastName,int id,String email,String branch, String instructorId, String instructorPassword) {
		super(firstName,lastName,id,email);
		this.branch = branch;
		this.instructorId = instructorId;
		this.instructorPassword = instructorPassword;
	}

	public Instructor(String branch, String instructorId, String instructorPassword) {
		super();
		this.branch = branch;
		this.instructorId = instructorId;
		this.instructorPassword = instructorPassword;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorPassword() {
		return instructorPassword;
	}

	public void setInstructorPassword(String instructorPassword) {
		this.instructorPassword = instructorPassword;
	}
	
	

}
