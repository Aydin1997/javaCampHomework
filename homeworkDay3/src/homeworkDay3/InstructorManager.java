package homeworkDay3;





public class InstructorManager {
	
	public void addInstructor(Instructor instructor) {
		System.out.println("Yeni Eðitmen Eklendi: "+instructor.getFirstName()+" "+instructor.getLastName());
	}
	
	public void deleteInstructor(Instructor instructor) {
		System.out.println("Eðitmen Silindi: "+instructor.getFirstName()+" "+instructor.getLastName());
	}
	
	public void updateInstructor(Instructor instructor) {
		System.out.println("Eðitmen Bilgileri Güncellendi: "+instructor.getFirstName()+" "+instructor.getLastName());
	}
}
