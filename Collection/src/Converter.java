import java.util.*;
public class Converter
{
	public void kuha() {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Select 'D' if Dollar to Peso:");
		System.out.print("and Select 'P' if Peso to Dollar:");
		char convert = input.nextLine().charAt(0);
		
		if(convert == 'D' || convert == 'd')
		{
			System.out.print("Enter a Amount of Dollar:");
			double dollar = input.nextDouble();
			System.out.print(dollar*51);
		
		}
		if(convert == 'P' || convert == 'p')
		{
			System.out.print("Enter a Amount of Peso:");
			double peso = input.nextDouble();
			System.out.print(peso/51);
		}
	}
}