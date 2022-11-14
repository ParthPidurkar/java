class Power
{  
	public static void main(String args[])
	{  		
		int result=1;
		int base = Integer.parseInt(args[0]); 
		int exponent = Integer.parseInt(args[1]);
		while (exponent != 0)
		{
			result *= base;
			exponent--;
		}
		System.out.println("Answer: " + result);
	}  
}  