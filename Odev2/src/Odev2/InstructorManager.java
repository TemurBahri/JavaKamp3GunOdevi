package Odev2;

public class InstructorManager extends UserManager {
	
	public void add(User user) {
		System.out.println("Eğitici eklendi : " + user.getId() + " " + user.getFistName() + " " + user.getLastName() + " " + user.getCourse() + " " + user.getCountry());
		
	}
	
	public void delete(User user) {
		System.out.println("Eğitici silindi ");
	}

}
