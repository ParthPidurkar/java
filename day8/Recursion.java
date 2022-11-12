class Recursion
{
	static int factorial(int number)
	{
		if(number == 0 || number == 1)
		{
			return(1);
		}
		else
		{
			return(number*factorial(number-1));
		}
		
	}
	
	public static void main(String arg[])
	{
		int number = 4;
		System.out.println("factorial = " + factorial( number));
		
	}
}