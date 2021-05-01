package Odev2;

public class Main {

	public static void main(String[] args) {
	
		
		Student student = new Student(null);
		student.setId(1);
		student.setFistName("Timur");
		student.setLastName("Bahri");
		student.setEmail("timur@timur.com");
		student.setCourse("Java / React");
		student.setStudentNumber("16");
		student.setCountry("Bursa");
		
		System.out.println(student.getFistName() + " " + student.getLastName());
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setCourse("Java / React");
		instructor.setFistName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setCountry("Diyarbakır");
		
		
		System.out.println("--------------------------------------------");
		System.out.println(instructor.getFistName() + " " + instructor.getLastName());
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		

	}

}
