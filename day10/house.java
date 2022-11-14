import java.util.*;
class room
{
	public int length, bredth;
	room()
	{
		length = 5;
		bredth = 6;
	}

	
}
class bedroom extends room
{
	int h;
	bedroom()
	{
		super();
		h = 4;
	}
	public int area()
	{
		return(length * bredth);
	}
	public int volume()
	{
		return(length * bredth*h);
	}
		
	
}

class house
{
	public static void main(String args[])
	{
		bedroom b1 = new bedroom();
		System.out.println("Area of room = " + b1.area());
		System.out.println("Volume of room = " + b1.volume());
	}
}