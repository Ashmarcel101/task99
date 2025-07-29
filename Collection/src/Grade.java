import java.util.Scanner;
public class Grade
{
    public void Grado()
    {
    
    
    System.out.println("					"+"*************************");
	System.out.println("					"+"*	Grading System	    *");
	System.out.println("					"+"*************************");
	
        int marks[] = new int[7];
        int i;
        float total=0, avg;
        Scanner input = new Scanner(System.in);
		
        
        for(i=0; i<7; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = input.nextInt();
           total = total + marks[i];
        }
       
      
        avg = total/7;
        System.out.print("Input Grades ");
        if(avg>=95)
        {
            System.out.println(" You Past Congratulations");
        }
        else if(avg>=90 && avg<80)
        {
           System.out.println(" You Past Get Closer");
        } 
        else if(avg>=75 && avg<70)
        {
            System.out.println(" You Past Great Job");
        }
        else
        {
            System.out.println(" You Failed Try Again");
        }
    }

}

