package homeworkDay3;

public class Student extends User {
	
	private String studentCourse;
	private String studentId;
	private String studentPassword;
	
	public Student() {
		
	}
	// E�er inherit edilen bir s�n�fta ki field'lar� kullanmak istiyorsak super i�erisine o �zellikleri yazmam�z gerekir!
	// ve unutmadan inherit edilen s�n�fta default constructor olu�turularak super() anahtar kelimesi yaz�l�r!!
	
	public Student(String firstName,String lastName,int id,String email,String studentCourse, String studentId, String studentPassword) {
		super(firstName,lastName,id,email); 
		this.studentCourse = studentCourse;
		this.studentId = studentId;
		this.studentPassword = studentPassword;
		
	}

	public Student(String studentCourse, String studentId, String studentPassword) {
		super();
		this.studentCourse = studentCourse;
		this.studentId = studentId;
		this.studentPassword = studentPassword;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	
	
	

	

	
	
	

}
