package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();  // Yapici Constructor Kullanildi.
		student1.setStudentCourse("Java");
		student1.setStudentId("kullanici");
		student1.setStudentPassword("password1");
		student1.setFirstName("Aydın");
		student1.setLastName("Şimşek");
		student1.setId(1);
		student1.setEmail("simsekaydin01@gmail.com");
		
		Student student2=new Student("İlkay","Şimşek",2,"simsekilkay01@gmail.com","Python","kullaniciAdi2","password2");
		
		Student student3=new Student("Eren","Şimşek",3,"simsekeren01@gmail.com","C#","kullaniciAdi3","password3");
		
		Instructor instructor1=new Instructor("Engin","Demiroğ",1001,"engindemirog@gmail.com",
				"Tüm yazılım dilleri", "kullaniciAdi4", "password4");
		
		StudentManager studentManager=new StudentManager();
		studentManager.addStudent(student1);
		studentManager.deleteStudent(student2);
		studentManager.updateStudent(student3);
		
		InstructorManager instructorManager=new InstructorManager();
		System.out.println("---------------------------");
		instructorManager.addInstructor(instructor1);
		instructorManager.deleteInstructor(instructor1);
		instructorManager.updateInstructor(instructor1);
		
		UserManager userManager1=new UserManager();
		System.out.println("---------------------------");
		userManager1.getUser(student3);;
		userManager1.getUser(instructor1);
		
		
		
		
		
		
		
		

	}

}
