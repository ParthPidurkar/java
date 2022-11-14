//pr3
import java.util.*;
class student
{
	
	private
	int Roll_no,total_marks;
	float percentage;
	String name;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name = ");
		name = sc.next();
		System.out.println("Enter roll no = ");
		Roll_no = sc.nextInt();
		System.out.println("Enter Total marks = ");
		total_marks = sc.nextInt();
		System.out.println("Enter percentage = ");
		percentage = sc.nextFloat();
	}
	void display()
	{
		System.out.println("Name = " + name);
		System.out.println("Roll_no = " + Roll_no);
		System.out.println("Total marks = " + total_marks);
		System.out.println("percentage = " + percentage);
	}

	public static void main(String args[])
		{
			
			student s1 = new student();
			s1.getdata();
			s1.display();
			
			
		}
}