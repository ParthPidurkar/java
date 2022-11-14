import java.util.*;
class factorial
{
  public static void main (String args[])
	{
  
		int i,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial ");
		int num = sc.nextInt();
		for(i = 1;i <= num ; i++)
			{    
				fact=fact*i;    
			}
		System.out.println("factorial of number is " + fact);
	}    
	   
}