
/**
 * @author Junjie Xu
 * @version 1.0
 * @see java.lang.Object
 * @since 11.0.15
 * This is the inherited class from programmer.java
 */


public class CommissionProgrammer extends Programmer { 
	/**
	 * add variable gross weekly sales
	 */
	private double grossSales; 
	/**
	 * add variable commission percentage
	 */
	private double commissionRate;

	/**
	 * constructor with arguments
	 * @param firstName first name of the programmer
	 * @param lastName last name of the programmer
	 * @param socialSecurityNumber social security number of the programmer
	 * @param month total worked months
	 * @param year total worked years
	 * @param grossSales gross weekly sales
	 * @param commissionRate percentage of commission
	 */
	public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year, double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { 
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
		if (grossSales < 0.0) { 
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} 

	/**
	 * method to set grossSales value
	 * @param grossSales gross sales amount
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { 
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		this.grossSales = grossSales;
	} 

	/**
	 * method to get values from grossSales 
	 * @return grossSales
	 */
	public double getGrossSales() {
		return grossSales;
	} 

	/**
	 * method to set commission rate value
	 * @param commissionRate percentage of commission
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { 
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
		this.commissionRate = commissionRate;
	} 

	/**
	 * method to get value from commissionRate
	 * @return commissionRate
	 */
	public double getCommissionRate() {
		return commissionRate;
	} 

//calculate earnings; override abstract method earnings in Programmer.
	@Override                                                           
	public double earnings() {                                            
		return getCommissionRate() * getGrossSales();                    
	}                                             

	/**
	 * implement method getPaymentAmount()
	 */
	@Override
	public double getPaymentAmount() {
		return earnings();
	}

	@Override                                                 
	public String toString() {
		return String.format("commission Programmer: %s\n%s $%,.2f%s %.2f", super.toString(),"gross sales:",getGrossSales(),"; commission rate:",getCommissionRate());
	}

}
