import java.util.*;
public class Payroll {
    public void Sahod()
          { 
	 	System.out.println("					"+"*************************");
		System.out.println("					"+"*	 Payroll System	   	*");
		System.out.println("					"+"*************************");
          Scanner input = new Scanner(System.in);
          double payRate = 0;
          double hoursWorked = 0;
          double grossPay = 0;
          double over_Time =0;
        
                                            
          
          System.out.print("					"+"Enter your pay rate:");
          payRate = input.nextInt();
          System.out.print("					"+"Enter your hours per week:");
          hoursWorked = input.nextInt();
          grossPay = hoursWorked * payRate; 
        
       
          if ( hoursWorked <= 56)
                       {
           
              grossPay = hoursWorked * payRate ;
               
              System.out.println("Your worked hours:" + hoursWorked + " this week, your gross pay:  " + grossPay+ "pesos");
                          }
          else if (hoursWorked > 56) 
                    { 
               grossPay += ((hoursWorked-56) * ((payRate)*0.0125*100));
               
               System.out.println( "Your worked hours with OT: " + hoursWorked + " this week, your gross pay:   " +grossPay+" pesos");
                over_Time= hoursWorked-56;
               System.out.println("Your Over Time is  " +over_Time+ "    hours");
           
               }
          
            } 
}

