import java.util.*;
import javax.swing.JOptionPane;
public class Login
{
    public void Login(){
       }
    public static void main (String []args) throws Exception
    {
        String us;
        String pw;
        int choice;
        int select;
        
        Scanner input= new Scanner(System.in);
        Login l = new Login();
       System.out.print("Enter UserName :");
        us=input.next();
       System.out.print("Enter Password :");
        pw=input.next();
        
         
   {
   
	if( us.equals("marcel") && pw.equals("abo") || us.equals("ash")&& pw.equals("marcelo") )
   {
   
    System.out.println("					"+"Access Granted!");
    Frontpage f=new Frontpage();
         f.hook();
     
        
        }	
   else
   {
   	
    System.out.println("			"+"Invalid Username and Password!");
    System.out.println("					"+"Login again"+" ");
    Login.main(args);
    return;
    
    }
   }
    
    }
}

   
        