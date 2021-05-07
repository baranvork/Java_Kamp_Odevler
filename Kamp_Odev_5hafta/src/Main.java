import business.abstracts.UserService;
import business.concretes.UserManager;
import dataAccess.concretes.EnterUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new EnterUserDao());
		User user1 = new User(1,"Baran","baþaran","baranvork@hotmail.com", "baran123");
		User user2 = new User(2,"Deniz","katýrcý","denizbes@gmail.com", "deniz123");
		User user3 = new User(2,"Deniz","katýrcý"," ", "deniz123"); //login - add ve google hata verecejtir.
		userService.add(user1);
		userService.add(user2);
		userService.add(user3);
		userService.googleService(user3);
		userService.googleService(user2);
		userService.login(user3);
		userService.login(user1);
		


	}

}
