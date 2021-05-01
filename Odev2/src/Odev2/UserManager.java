package Odev2;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullanıcı eklendi : " + user.getId() + " " + user.getFistName() + " " + user.getLastName() + " " + user.getCourse() + " " + user.getCountry()+ " " + user.getEmail());
	}
	
	public void delete(User user) {
		System.out.println("Kullanıcı silindi");
	}

}
