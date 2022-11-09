class BreakAndContinueUsingLoops
{
	public static void main(String args[])
	{
		int i = 1;
		/* exampe for Break
		while(i <= 3)
		{
			System.out.println(i);
			i++;
			if(i == 2)
			{
				System.out.println("End of loop using break");
				break;
			}
		}*/
		
		
		// Example For Continue
		for(i=0;i<=3;i++)
		{
			if(i == 2)
			{
				continue;
			}
			System.out.println(i);
			
		}
		System.out.println(i);
		System.out.println("Hi Parth");
		
	}
}