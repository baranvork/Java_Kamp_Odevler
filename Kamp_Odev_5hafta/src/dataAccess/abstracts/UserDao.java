package dataAccess.abstracts;
import java.util.List;
import entities.concretes.User;

public interface UserDao {
	void add(User user);
	void sendmail (User user);
	void pressLink (User user);
	boolean checkIfRealEmail(User user);
	boolean googleCheck (User user);
	boolean login(User user);
	List <User> getAll();
}
