class triangle
{
	private float b,h;
	private int l1,l2,l3;
	triangle(int ba, int he,int le1,int le2,int le3)
	{
		b = ba;
		h = he;
		l1 = le1;
		l2 = le2;
		l3 = le3;
	}
	public double area()
	{
		return(0.5 * h * b);
	}
	
	public int parimeter()
	{
		return(l1 + l2 + l3);
	}
	public static void main(String arg[])
	{

		triangle t1 = new triangle(2,3,30,20,40);
		System.out.println("Area =" + t1.area());
		System.out.println("parimeter =" + t1.parimeter());
	}
}