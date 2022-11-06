import java.util.Scanner;
class CalculatePercentage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float sub1,sub2,sub3,sub4,sub5;
		System.out.println("Enter Marks of 1st Subject = ");
		sub1 = sc.nextFloat();
		System.out.println("Enter Marks of 2nd Subject = ");
		sub2 = sc.nextFloat();
		System.out.println("Enter Marks of 3rd Subject = ");
		sub3 = sc.nextFloat();
		System.out.println("Enter Marks of 4th Subject = ");
		sub4 = sc.nextFloat();
		System.out.println("Enter Marks of 5th Subject = ");
		sub5 = sc.nextFloat();
		System.out.println("Enter total Marks of all Subject = ");
		float total = sc.nextFloat();
		float marks = sub1 + sub2 + sub3 + sub4 + sub5;
		float totalmarks = (marks/total);
		double percentage = totalmarks * 100;
		System.out.println("Percentage = " + percentage);
	}
}