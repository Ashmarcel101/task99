 import java.util.Scanner;

public class Calculator
{
public void Bilang()
{
    System.out.println("					"+"*************************");
	System.out.println("					"+"*  Calculator System	    *");
	System.out.println("					"+"*************************");
    float a, b, res;
    char choice;
    int select;
    Scanner scan = new Scanner(System.in);

    do
    {
        System.out.print("(1) Addition\n");
        System.out.print("(2) Subtraction\n");
        System.out.print("(3) Multiplication\n");
        System.out.print("(4) Division\n");
        System.out.print("(5) Exit and Choose another program\n");
        
        System.out.println("Enter Your Choice :");
       
        choice = scan.next().charAt(0);
       

        switch (choice)
        {
            case '1' : System.out.print("Enter 1st Number : ");
                a = scan.nextFloat();
                System.out.print("Enter Last Number : ");
                b = scan.nextFloat();
                res = a + b;
                System.out.println("Result = " + res);
                break;
            case '2' :  System.out.print("Enter 1st  Number : ");
                a = scan.nextFloat();
                System.out.print("Enter Last Number : ");
                b = scan.nextFloat();
                res = a - b;
                System.out.println("Result = " + res);
                break;
            case '3' :  System.out.print("Enter 1st  Number : ");
                a = scan.nextFloat();
                System.out.print("Enter Last Number : ");
                b = scan.nextFloat();
                res = a * b;
                System.out.print("Result = " + res);
                break;
            case '4' :  System.out.print("Enter 1st  Number : ");
                a = scan.nextFloat();
                System.out.print("Enter Last Number : ");
                b = scan.nextFloat();
                res = a / b;
                System.out.println("Result = " + res);
                break;
            case '5' : Frontpage f=new Frontpage();
         				f.hook();
     
                break;
           
            default : System.out.println("Wrong Choice!!!");
        }
    }while(choice != 5);       
}
}
