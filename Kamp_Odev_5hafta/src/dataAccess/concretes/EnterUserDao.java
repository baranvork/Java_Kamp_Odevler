package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

import java.util.regex.Pattern;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class EnterUserDao implements UserDao{
	ArrayList <String> email = new ArrayList<String>();

	
	private static final Pattern VALID_EMAILTYPE = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
    @Override
    public boolean checkIfRealEmail(User user) {
        Matcher matcher = VALID_EMAILTYPE.matcher(user.getEmail());
        return matcher.find();
    }

	@Override
	public void add(User user) {
		System.out.println("Hesab�n�z a��ld� giri� yapabilmeniz i�in mail adresinizdeki linke basman�z gerekmekte.");
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendmail(User user) {
		System.out.println("Mail g�nderildi.");
		
	}

	@Override
	public boolean googleCheck(User user) {
		Matcher matcher = VALID_EMAILTYPE.matcher(user.getEmail());
        return matcher.find();
	}

	@Override
	public boolean login(User user) {
		Matcher matcher = VALID_EMAILTYPE.matcher(user.getEmail());
        return matcher.find();
		
	}

	@Override
	public void pressLink(User user) {
		if (user.getFirstName() == "Baran") {
			System.out.println("Kay�t olundu.");
		}
		else {
			System.out.println("Kay�t olunamad�.");
		}
		
		
	}

}

