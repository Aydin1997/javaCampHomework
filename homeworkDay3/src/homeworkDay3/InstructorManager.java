package homeworkDay3;





public class InstructorManager {
	
	public void addInstructor(Instructor instructor) {
		System.out.println("Yeni E�itmen Eklendi: "+instructor.getFirstName()+" "+instructor.getLastName());
	}
	
	public void deleteInstructor(Instructor instructor) {
		System.out.println("E�itmen Silindi: "+instructor.getFirstName()+" "+instructor.getLastName());
	}
	
	public void updateInstructor(Instructor instructor) {
		System.out.println("E�itmen Bilgileri G�ncellendi: "+instructor.getFirstName()+" "+instructor.getLastName());
	}
}
