class Biggest
{  
	public static void main(String args[])
	{  		
		int a = Integer.parseInt(args[0]); 
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if (a > b && a > c)
		{
			System.out.println("First Number is Biggest");
		}
		else if(b > a && b > c)
		{
			System.out.println("Second Number is Biggest");
		}
		else
		{
			System.out.println("Third Number is Biggest");
		}
	}  
}  