/**
 * @author Junjie Xu
 * @version 1.0
 * @see java.lang.Object
 * @since 11.0.15
 * This is the inherited class from programmer.java
 */

public class HourlyProgrammer extends Programmer {
	/**
	 * add double variable wage
	 */
	private double wage; // wage per hour
	
	/**
	 * add double variable hours
	 */
	private double hours; // hours worked for week

	//constructor
	/**
	 * construct with initial values
	 * @param firstName first name of the programmer
	 * @param lastName last name of the programmer
	 * @param socialSecurityNumber social security number of the programmer
	 * @param month total worked months
	 * @param year total worked years
	 * @param wage wage rate for programmer
	 * @param hours total hours worked for programmer
	 */
	public HourlyProgrammer(String firstName, String lastName,String socialSecurityNumber, int month, int year, 
			double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (wage < 0.0) {
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) {
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}

		this.wage = wage;
		this.hours = hours;
	} 

	/**
	 * method to set wage rate 
	 * @param wage wage rate for programmer
	 */
	public void setWage(double wage) {
		if (wage < 0.0) {
			throw new IllegalArgumentException(
    	"Hourly wage must be >= 0.0");
		}

		this.wage = wage;
	} 

	/**
	 * method to get wage
	 * @return wage wage rate 
	 */
	public double getWage() {
		return wage;
	} 

	/**
	 * method to set worked hours
	 * @param hours total hours worked
	 */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) {
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}

		this.hours = hours;
	} 

	/**
	 * method to get worked hours
	 * @return hours total worked hours
	 */
	public double getHours() {
		return hours;
	} 

	/**
	 * override inherited abstract method too make it concrete
	 */
	@Override                                                           
	public double earnings() {                                            
		if (getHours() <= 40) { // no overtime                           
			return getWage() * getHours();   
		}
		else {                                                             
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}   
	
	/**
	 * implement method getPaymentAmount()
	 */
	@Override
	public double getPaymentAmount() {
		return earnings();
	}

	/**
	 * override toString method to display specific information
	 */
	@Override                                                           
	public String toString() {
		return String.format("hourly Programmer: %s\n%s $%,.2f%s %.2f", super.toString(),"hourly wage:",getWage(),"; hours worked:",getHours());
	}
                     
}

