import java.util.*;
class room
{
	public int length, bredth;
	room()
	{
		length = 50;
		length = 60;
	}
	room(int l,int b)
	{
		length = l;
		bredth = b;
	}
}
class bedroom extends room
{
	int h;
	bedroom()
	{
		super(l,b);
		h = 40;
	}
	bedroom(int l,int b,int he)
	{
		super(l,b);
		h = he;
	}
	
	public void area()
	{
		return(length * bredth);
	}
		
	
}

class house
{
	
}