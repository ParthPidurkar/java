class VariableArguments
{
	static int sum(int ...arr)
	{
		int result = 0;
		for(int a:arr)
		{
			result = result + a; 
		}
		return(result);
	}
	public static void main(String arg[])
	{
		System.out.println(sum());
		System.out.println(sum(1,2));
		System.out.println(sum(2,3,4));
		System.out.println(sum(4,5,6));
	}
}