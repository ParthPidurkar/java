import java.util.Scanner;
class Empolyee
{
	Scanner sc = new Scanner(System.in);
	String name;
	int salary;
	public void getsal()
	{
		System.out.println("Salary =" + salary);
	}
	public void getnam()
	{
		System.out.println("Name =" + name);
	}
	public void setsal()
	{
		System.out.println("Enter Salary :");
		salary = sc.nextInt();
	}
	public void setnam()
	{
		System.out.println("Enter Name :");
		name = sc.nextline();
	}
	
}
class ProblemSet1
{
	public static void main(String arg[])
	{
		Empolyee E1 = new Empolyee();
		E1.setsal();
		E1.setnam();
		E1.getsal();
		E1.getnam();
		
	}
}
