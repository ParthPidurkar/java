import java.util.*;
class rectangle
{
	private int len,bre;
	public
	void set(int l,int b)
	{
		len = l;
		bre = b;
	}
	int area()
	{
		return(len * bre);	
	}
}
class main
{
		public static void main(String args[])
		{
			rectangle r1 = new rectangle();
			rectangle r2 = new rectangle();
			r1.set(4,5);
			r2.set(5,8);
			System.out.println("Area of 1st Rectangle =" + r1.area());
			System.out.println("Area of 2nd Rectangle =" + r2.area());
			
		}
}