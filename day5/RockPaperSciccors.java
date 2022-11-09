import java.util.Scanner;
import java.util.Random;
class RockPaperSciccors
{
	public static void main(String agr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Rock");
		System.out.println("Enter 2 for Rock");
		System.out.println("Enter 3 for Rock");
		int user_choice;
		
		
		Random rand = new Random();
        int comp_choice = rand.nextInt(3); // taking computer input (random)
		
		
        System.out.println("Enter Your choice");
        
        user_choice = sc.nextInt();
		
		 if (comp_choice == user_choice) {
            System.out.println("Its a draw!");
        } else if (comp_choice == 0) {
            if (user_choice == 1) {
                System.out.println("You Won");
            } else if (user_choice == 2) {
                System.out.println("Computer Won");
            }
        } else if (comp_choice == 1) {
            if (user_choice == 0) {
                System.out.println("Computer Won");
            } else if (user_choice == 2) {
                System.out.println("You Won");
            }
        } else if (comp_choice == 2) {
            if (user_choice == 0) {
                System.out.println("You Won");
            } else if (user_choice == 1) {
                System.out.println("Computer Won");
            }
        }
		
	}
}