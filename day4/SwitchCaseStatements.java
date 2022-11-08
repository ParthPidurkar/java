import java.util.Scanner;
class SwitchCaseStatements
{
	public static void main(String agr[])
	{
		int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
		
		
       /*
	   //Normal Switch condition
	   switch(age)
	   {
		   case 18:
		    System.out.println("You are going to become an adult");
			break;
			case 23:
		     System.out.println("You are going to join job");
			break;
			case 60:
		     System.out.println("You are going to retired");
			break;
			default:
		     System.out.println("Enjoy your life");
	   }*/
	   
	   
	   
	   //Enhanced Switch condition
        switch (age) {
            case 18 -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case 23 -> System.out.println("You are going to join a Job!");
            case 60 -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
	}
}