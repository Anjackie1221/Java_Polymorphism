/**
 * @author Junjie Xu
 * @version 1.0
 * @see java.lang.Object
 * @since 11.0.15
 * This is the inherited class from Commissionprogrammer.java
 */

public class BasePlusCommissionProgrammer extends CommissionProgrammer { 
	/**
	 * add variable base salary per week
	 */
	private double baseSalary;

	/**
	 * constructor with arguments
	 * @param firstName first name of the programmer
	 * @param lastName last name of the programmer
	 * @param socialSecurityNumber social security number of the programmer
	 * @param month total worked months
	 * @param year total worked years
	 * @param grossSales gross weekly sales
	 * @param commissionRate percentage of commission
	 * @param baseSalary weekly base salary
	 */
	public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, month, year, grossSales, commissionRate);
		if (baseSalary < 0.0) {               
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;                
		}

	//set base salary
	/**
	 * method to set baseSalary value
	 * @param baseSalary weekly base salary
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;                
	} 

	/**
	 * method to get value from baseSalary
	 * @return baseSalary
	 */
	public double getBaseSalary() {
		return baseSalary;
	}

	@Override                                                            
	public double earnings() {                                             
		return getBaseSalary() + super.earnings();    
	} 

	/**
	 * override method getPaymentAmount()
	 */
	@Override
	public double getPaymentAmount() {
		return earnings();
	}
	
	@Override     
	public String toString() {
		return String.format("base-plus %s%s %.2f", super.toString(),"; base salary:",getBaseSalary());
	}
}



