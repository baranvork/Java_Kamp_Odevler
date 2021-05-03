
public class Gamer {
	private int id;
	private String FirstName;
	private String LastName;
	private String NationalId;
	private String DayOfBirth;
	private String FullName;
	
	public Gamer () {
		
	}
	
	public Gamer(int id, String firstName, String lastName, String nationalId, String dayOfBirth) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		NationalId = nationalId;
		DayOfBirth = dayOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getNationalId() {
		return NationalId;
	}

	public void setNationalId(String nationalId) {
		NationalId = nationalId;
	}

	public String getDayOfBirth() {
		return DayOfBirth;
	}

	public void setDayOfBirth(String dayOfBirth) {
		DayOfBirth = dayOfBirth;
	}

	public String getFullName() {
		return getFirstName() + " " + getLastName();
	} 

}
