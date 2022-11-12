class methods
{
	static int addLogic(int x, int y)
	{
		return (x+y);
	}
	static int subLogic(int x, int y)
	{
		return (x-y);
	}
	static int mulLogic(int x, int y)
	{
		return (x*y);
	}
		

	public static void main(String arg[])
	{
		int a = 10;
		int b = 20;
		int c = addLogic(a,b);
		int c1 = subLogic(a,b);
		int c2 = mulLogic(a,b);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
	}
}
