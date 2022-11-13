class circle
{
	private float r;
	circle(int ra)
	{
		r = ra;
	}
	public double area()
	{
		return( 3.14*r*r);
	}
	
	public double parimeter()
	{
		return(2 * 3.14 *r);
	}
	public static void main(String arg[])
	{

		circle t1 = new circle(20);
		System.out.println("Area =" + t1.area());
		System.out.println("parimeter =" + t1.parimeter());
	}
}