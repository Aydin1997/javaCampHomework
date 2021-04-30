package homeworkDay3;

public class Student extends User {
	
	private String studentCourse;
	private String studentId;
	private String studentPassword;
	
	public Student() {
		
	}
	// Eðer inherit edilen bir sýnýfta ki field'larý kullanmak istiyorsak super içerisine o özellikleri yazmamýz gerekir!
	// ve unutmadan inherit edilen sýnýfta default constructor oluþturularak super() anahtar kelimesi yazýlýr!!
	
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
