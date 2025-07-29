import java.util.*;
public class Atmbank 
{
    public void businessAccount()
	{
	
	System.out.println("					"+"*************************");
	System.out.println("					"+"*	Atm System	   	 	*");
	System.out.println("					"+"*************************");
	}
    int availableBal3 =50000;
    int totalBal3 =60000;
    int AM=10000;

   
    {
        int selection;

        System.out.println("\nATM main menu:");
        System.out.println("1 - View account balance");
        System.out.println("2 - Withdraw funds");
        System.out.println("3 - Add funds");
        System.out.println("4 - Back to Account Menu");
        System.out.println("5 - Terminate transaction");
        System.out.print("Choice: ");
        Scanner input= new Scanner(System.in);
        selection = input.nextInt();

        switch(selection)
        {
        case 1:
            viewAccountInfo3();
            break;
        case 2:
            withdraw3();
            break;
        case 3:
            addFunds3();
            break;
        case 4:
            System.out.println("");
             businessAccount();

            break;
        case 5:
            System.out.println("Thank you for using this ATM!!! goodbye");
            Frontpage C3=new Frontpage();
         C3.hook();
         default:             
                System.out.println("Invalid choice.");
                businessAccount();

        }
            }


    public void addFunds3()
    {
        int addSelection;

        System.out.println("Deposit funds:");
        System.out.println("1 - 500");
        System.out.println("2 - 1000");
        System.out.println("3 - 2000");
        System.out.println("4 - 5000");
        System.out.println("5 - Back to main menu");
        System.out.print("Choice: ");
        Scanner input= new Scanner(System.in);
        addSelection = input.nextInt();

        switch(addSelection)
        {
        case 1:
            deposit2(500);
            businessAccount();
            break;
        case 2:
            deposit2(1000);
            businessAccount();
            break;
        case 3:
            deposit2(2000);
            businessAccount();
            break;
        case 4:
            deposit2(5000);
            businessAccount();
            break;
        case 5:
            businessAccount();
            break;
        }
    }

    public void withdraw3()
    {
        int withdrawselection;

        System.out.println("Withdraw money:");
        System.out.println("1 - 500");
        System.out.println("2 - 1000");
        System.out.println("3 - 2000");
        System.out.println("4 - 5000");
        System.out.println("5 - Back to main menu");
        System.out.print("Choice: ");
        Scanner input= new Scanner(System.in);
        withdrawselection = input.nextInt();

        switch(withdrawselection)
        {
        case 1:
            checkNsf3(500);
            businessAccount();
            break;
        case 2:
            checkNsf3(1000);
            businessAccount();
            break;
        case 3:
            checkNsf3(2000);
            businessAccount();
            break;
        case 4:
            checkNsf3(5000);
            businessAccount();
            break;
        case 5:
            businessAccount();
            break;
        }
    }

    public void viewAccountInfo3()
    {

        System.out.println("Account Information:");
        System.out.println("\t--Total balance: P"+totalBal3);
        System.out.println("\t--Available balance: P"+availableBal3);
        businessAccount();
    }

    public void deposit2(int depAmount)
    {
        System.out.println("\n***Please insert your money now...***");
        totalBal3 =totalBal3 + depAmount;
        availableBal3 =availableBal3 + depAmount;
    }

    public void checkNsf3(int withdrawAmount)
    {
        if(totalBal3 -withdrawAmount < 0)
            System.out.println("\n***ERROR!!! Insufficient funds in you accout***");
        else
        {
            totalBal3 =totalBal3 - withdrawAmount;
            availableBal3 =availableBal3 - withdrawAmount;
            System.out.println("\n***Please take your money now...***");
            }
    }
}