package homeworkDay3;


public class StudentManager {
	
	public void addStudent(Student student) {
		
		System.out.println("Yeni Öðrenci kaydedildi: "+student.getFirstName()+" "+student.getLastName());
	}
	
	public void deleteStudent(Student student) {
		System.out.println("Öðrenci Silindi: "+student.getFirstName()+" "+student.getLastName());
	}
	
	public void updateStudent(Student student) {
		System.out.println("Öðrenci Bilgileri Güncellendi: "+student.getFirstName()+" "+student.getLastName());
	}

}
