/**
 * @author Junjie Xu
 * @version 1.0
 * @see java.lang.Object
 * @since 11.0.15
 * This is the inherited class from programmer.java
 */

public class SalariedProgrammer extends Programmer  {
	/**
	 * add variable weekly salary
	 */
	private double weeklySalary;

	/**
	 * constructor with arguments
	 * @param firstName first name of the programmer
	 * @param lastName last name of the programmer
	 * @param socialSecurityNumber social security number of the programmer
	 * @param month total worked months
	 * @param year total worked years
	 * @param weeklySalary weekly earns
	 */
	public SalariedProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year, double weeklySalary) 
	{
		super(firstName, lastName, socialSecurityNumber, month, year); 

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	} 

	/**
	 * method to set weeklySalary value
	 * @param weeklySalary programmer's weekly salary
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	} 

	/**
	 * method to get value of weeklySalary
	 * @return weeklySalary programmer's weekly salary value
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	} 

	/**
	 * override inherited abstract method too make it concrete
	 */
	@Override                                                           
	public double earnings() {                                          
		return getWeeklySalary();                                        
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
		return String.format("salaried Programmer: %s\nweekly salary: $%.2f", super.toString(),getWeeklySalary());
	}
}

