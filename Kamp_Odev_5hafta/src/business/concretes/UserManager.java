package business.concretes;
import java.util.List;
import java.util.ArrayList;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	private ArrayList <String> email = new ArrayList<String>();
	
	private UserDao userDao;
	

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		if(user.getPassword().length() < 6 || user.getFirstName().length() < 2 || user.getLastName().length() < 2 || email.contains(user.getEmail())) {
			System.out.println("Bilgi hatas�");
			return;
		}
		if(userDao.checkIfRealEmail(user) == false) {
			System.out.println("\nMail regex taraf�ndan do�rulanamad�");
			return;}
		else {
			System.out.println("\nmail regex tarf�ndan do�ruland�");
		}
		this.userDao.sendmail(user);
		this.userDao.add(user);
		email.add(user.getEmail());
		this.userDao.pressLink(user);
	}

	@Override
	public List<User> getMail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void googleService(User user) {
		if (userDao.googleCheck(user) == true) {
			System.out.println("\nGoogle ile �ye olundu : " + user.getFirstName());
		}
		else {
			System.out.println("\nGoogle ile �ye olunamad�.");
		}		
		
	}

	@Override
	public void login(User user) {
		if (userDao.googleCheck(user) == true && user.getPassword() != null) {
			System.out.println("\nGiri� yap�ld� : " + user.getFirstName());
		}
		else {
			System.out.println("\nGiri� yap�lamad�.");
		}	
		
	}

}
