package homeworkDay3;


public class StudentManager {
	
	public void addStudent(Student student) {
		
		System.out.println("Yeni ��renci kaydedildi: "+student.getFirstName()+" "+student.getLastName());
	}
	
	public void deleteStudent(Student student) {
		System.out.println("��renci Silindi: "+student.getFirstName()+" "+student.getLastName());
	}
	
	public void updateStudent(Student student) {
		System.out.println("��renci Bilgileri G�ncellendi: "+student.getFirstName()+" "+student.getLastName());
	}

}
