class methodsOverloadingExample
{
	static int Logic(int x, int y)
	{
		return (x+y);
	}
	static int Logic(int x)
	{
		return (x*x);
	}
	static float Logic(float x, float y)
	{
		return (x/y);
	}
		

	public static void main(String arg[])
	{
		int a = 10;
		int b = 20;
		float a1 = 4.0f;
		float b1 = 4.0f;
		int c = Logic(a,b);
		int c1 = Logic(a,b);
		float c2 = Logic(a1,b1);
		System.out.println("Add = " +c);
		System.out.println("Square = " + c1);
		System.out.println("Divsion = " + c2);
		
	}
}