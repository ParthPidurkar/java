class rectangle
{
	private float b,l;
	rectangle(int br,int le)
	{
		b = br;
		l = le;
	}
	public double area()
	{
		return( l * b);
	}
	
	public double parimeter()
	{
		return(2 * l * b);
	}
	public static void main(String arg[])
	{

		rectangle t1 = new rectangle(20,10);
		System.out.println("Area =" + t1.area());
		System.out.println("parimeter =" + t1.parimeter());
	}
}