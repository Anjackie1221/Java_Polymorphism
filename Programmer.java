/**
 * @author Junjie Xu
 * @version 1.0
 * @see java.lang.Object
 * @since 11.0.15
 */

public abstract class Programmer  implements Payme{
	/**
	 * declaration String variable called first name
	 */
	private String firstName;
	/**
	 * declaration String variable called last name
	 */
	private String lastName;
	/**
	 * declaration String variable called social security number
	 */
	private String socialSecurityNumber;
	/**
	 * add int month value
	 */
	private int month;
	/**
	 * add int year value
	 */
	private int year;
	
//three-argument constructor
	/**
	 * constructor with initial values including month, year variable values
	 * @param first first name of the programmer
	 * @param last last name of the programmer
	 * @param ssn social security number of the programmer
	 */
	public Programmer(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}
	/**
	 * use constructor chain
	 * @param first first name of the programmer
	 * @param last last name of the programmer
	 * @param ssn social security number of the programmer
	 * @param month total worked months
	 * @param year total worked years
	 */
	public Programmer(String first, String last, String ssn, int month, int year) {
		this(first,last,ssn);
		this.month = month;
		this.year = year;
	}

	/**
	 * method to get firstName's value
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * method to set firstname's value
	 * @param firstName string type value contains first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * method to get lastName's value
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * method to set lastname's value
	 * @param lastName string type value contains last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * method to get social security number's value
	 * @return socialSecurityNumber
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * method to set social Security Number's value
	 * @param socialSecurityNumber string type value contains social Security Number
	 */
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	/**
	 * return String representation of Programmer object
	 */
	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	} 

	/**
	 * abstract method to calculate earning
	 * @return no return abstract method
	 */
	public abstract double earnings();
} 


