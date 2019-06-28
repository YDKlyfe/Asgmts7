import java.util.Scanner;

public class CalculatorforGCD {

	public static void main(String[] args) throws Exception {
	
	    Scanner imTheReader = new Scanner(System.in);
	    
	    System.out.println("Enter GCD value 1: ");
	    int num1 = imTheReader.nextInt();
	    System.out.println("Enter GCD value 2: ");
	    int num2 = imTheReader.nextInt();
	    

		int GCD = GCD (num1,num2);
		if(GCD == 1)
		{
		    throw new Exception("Exception. The GCD is: 1");
		}
		else
		{
		    System.out.println("The GCD is: " + GCD);
		}
		

	}
    
    	
	public static int GCD(int num1, int num2)
	{
	    //We start with an initial gcd as 1
	    int gcd = 1;
	   //Start a loop to check all possible nums between 1 and the less number
	   for(int i = 1; i <= num1 && i <= num2; i++)
	   {
	       //Check if the current i divides both nums
	       if(num1 % i == 0 && num2 % i == 0)
	       {
	           gcd = i;
	       }
	   }
	   return gcd;
	}
	
}
