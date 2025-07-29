import java.util.*;
public class Frontpage {
    
    public Frontpage(){
    }
    public void hook(){
        Scanner input = new Scanner(System.in);
        int option;
        String Yes;
        String No;
    
    
        
    
    
   
 	System.out.println("*********************************************************");
    System.out.println("*                   Program of Java                     *");
    System.out.println("*                   1.Payroll System                    *");
    System.out.println("*                   2.Atmbank System                 	*");
    System.out.println("*                   3.Counting System                   *");
    System.out.println("*                   4.Grading System                    *");
    System.out.println("*                   5.Calculator System	                *");
    System.out.println("*                   6.Binary System                     *");
    System.out.println("*                   7.Converter System              	*");
    System.out.println("*********************************************************");
    System.out.println("*                   Created by:              		*");
    System.out.println("*                   Abo Marcel               		*");
    System.out.println("*                   Ash Marcel               		*");
    System.out.println("*                   Abubu                		*");
    System.out.println("*                   Marcelo              		*");
    System.out.println("*                   Neko                                *");
    System.out.println("*                   Loading.....                        *");
    System.out.println("*********************************************************");
    System.out.println("                       Select Option");
   	System.out.println("				"+"Select the number of your choice:");
    option=input.next().charAt(0);
    System.out.print("\n");
       
    switch(option)
    {
   
   
    case'1':
            
         Payroll A1 = new Payroll();
         A1.Sahod();
         System.out.print("\n");
         System.out.print("Do you want another transaction?(Yes/No):");
         String B1=input.next();
         if(B1.equals("Yes") || B1.equals("yes"))
         {
         System.out.println("Choose Program Again");
         Frontpage f=new Frontpage();
         f.hook();
         }
         else
         {
             System.out.println("               "+"Thank You Come Again!");
         }
 

         return;
   case'2':
        
         Atmbank A2 = new  Atmbank();
         A2.businessAccount();
         System.out.print("\n");
         System.out.print("Do you want another transaction?(Yes/No):");
         String B2=input.next();
         if(B2.equals("Yes") || B2.equals("yes"))
         {
         System.out.println("Choose Program Again");
         Frontpage C2=new Frontpage();
         C2.hook();
         }
         else
         {
              System.out.println("               "+"Thank You Come Again!");
         }
         return;
        
    case'3':
        
         Counting A3 = new Counting();
         A3.Sukli();
         System.out.print("\n");
         System.out.print("Do you want another transaction?(Yes/No):");
         String B3=input.next();
         if(B3.equals("Yes") || B3.equals("yes"))
         {
         System.out.println("Choose Program Again");
         Frontpage C3=new Frontpage();
         C3.hook();
         }
         else
         {
              System.out.println("               "+"Thank You Come Again!");
         }
         return;
        
        
    case'4':
         
         Grade A4 = new Grade();
         A4.Grado();
         System.out.print("\n");
         System.out.print("Do you want another transaction?(Yes/No):");
         String B4=input.next();
         if(B4.equals("Yes") || B4.equals("yes"))
         {
         System.out.println("Choose Program Again");
         Frontpage C4=new Frontpage();
         C4.hook();
         }
         else
         {
              System.out.println("               "+"Thank You Come Again!");
         }
         return;
        
                 
        
     case'5':
        
         Calculator A5 = new Calculator();
         A5.Bilang();
         System.out.print("\n");
         System.out.print("Do you want another transaction?(Yes/No):");
         String B5=input.next();
         if(B5.equals("Yes") || B5.equals("yes"))
         {
         System.out.println("Choose Program Again");
         Frontpage C5=new Frontpage();
         C5.hook();
         }
         else
         {
              System.out.println("               "+"Thank You Come Again!");
         }
         return;
        case'6':
        	binary A6 = new binary();
         A6.aw ();
         System.out.print("\n");
         System.out.print("Do you want another transaction?(Yes/No):");
         String B6=input.next();
         if(B6.equals("Yes") || B6.equals("yes"))
         {
         System.out.println("Choose Program Again");
         Frontpage C6=new Frontpage();
         C6.hook();
         }
         else
         {
              System.out.println("               "+"Thank You Come Again!");
         }
         return;
         case'7':
        
         Converter A7 =new Converter();
         A7.kuha();
         System.out.print("\n");
         System.out.print("Do you want another transaction?(Yes/No):");
         String B7=input.next();
         if(B7.equals("Yes") || B7.equals("yes"))
         {
         System.out.println("Choose Program Again");
         Frontpage C6=new Frontpage();
         C6.hook();
         }
         else
         {
             System.out.println("Thank You Come Again!");
         }
         return;
        
        
    
       
        }
   
   
   
   
            
         
   }
   
   }