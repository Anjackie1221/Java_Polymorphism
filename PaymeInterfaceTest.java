/**
 * 
 * @author Junjie Xu
 * @version 1.0
 * @since 11.0.15
 * This is the main class to run the program
 */

public class PaymeInterfaceTest  {

public static void main(String[] args) {
	
	/**
	 * create six elements array
	 */	
	Payme[] payMeObj = new Payme[6];
	
	/**
	 * declaration six objects
	 */
	Invoice invoice1 = new Invoice("22776", "brakes", 3, 300.00);
	Invoice invoice2 = new Invoice("33442", "gear", 5, 90.00);
	SalariedProgrammer sProgrammer = new SalariedProgrammer("Chioma", "Xu", "345-67-0001", 10, 2022, 320.00);
	HourlyProgrammer hProgrammer = new HourlyProgrammer("Amara", "Xu","234-56-7770", 9, 2022, 18.95, 40.00);
	CommissionProgrammer cProgrammer = new CommissionProgrammer("Peter", "Xu", "123-45-6999", 8, 2022, 16500.00, 0.44);
	BasePlusCommissionProgrammer bProgrammer = new BasePlusCommissionProgrammer("Esther", "Xu", "102-34-5888", 7, 2022, 1200.00, 0.04, 720.00);
	
	payMeObj[0] = invoice1;
	payMeObj[1] = invoice2;
	payMeObj[2] = sProgrammer;
	payMeObj[3] = hProgrammer;
	payMeObj[4] = cProgrammer;
	payMeObj[5] = bProgrammer;
 
 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 
 for (Payme currentPayme : payMeObj) {
    // output currentPayme and its appropriate payment amount
    System.out.printf("%s \n", currentPayme.toString()); 
     
    /**
     * to check if the element is BasePlusCommissionProgrammer
     */
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
  
       // BasePlusCommissioProgrammer reference
       BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;

       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.10 * oldBaseSalary);
       System.out.printf(
          "new base salary with 10%% increase is: $%,.2f\n",
          programmer.getBaseSalary());
    } 

    /**
     * print statement
     */
    System.out.printf("payment due: $%,.2f\n\n",currentPayme.getPaymentAmount());
 }
}
}


