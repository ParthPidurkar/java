import java.util.Scanner;
class methodoverloading
{
	static void multiplication(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n + "*" + i +"=" + n*i);
		}
		
	}
	
	static void Pattern1(int numberOfRows)
	{
		for(int i =1;i<=numberOfRows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static int sumr(int num);
	{
		if(num == 1)
		{
			return(1);
		}
		else
		{
			return num + sumr(num-1);
		}
	}
	public static void main(String agr[])
	{
		Scanner sc = new Scanner(System.in);
		//problem 1 : multiplication table
		/*System.out.println("Enter number :-");
		int n = sc.nextInt();
		multiplication(n);*/
		
		//problem 2: draw Pattern
		/*System.out.println("Enter number or rows :-");
		int numberOfRows = sc.nextInt();
		Pattern1(numberOfRows);*/
		
		//problem 3: recursve function to calculate sum of natural number
		int c = sumr(9); 
		System.out.println("Sum = " + c);
		
	}
}