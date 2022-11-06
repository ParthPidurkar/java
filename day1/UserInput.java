import java.util.Scanner;
class UserInput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Taking Input form user");
		System.out.println("num1 = ");
		int a = sc.nextInt();
		System.out.println("num2 = ");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("Sum = " + sum);
	}
}