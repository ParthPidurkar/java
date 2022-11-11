import java.util.Scanner;
class PracticeSet2
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		//problem 2: To search element in array
		int size,count = 0;
		System.out.println("Enter the size of array :");
		size = sc.nextInt();
		int array2[] = new int[size];
		System.out.println("Enter element in array :");
		for(int i = 0;i<size;i++)
		{
			array2[i] = sc.nextInt();
		}
		System.out.println("Enter number to find in array :");
		int key = sc.nextInt();
		/*for(int i = 0;i<size;i++)
		{
			if (array2[i] == key)
			{
				System.out.println("Key Found at "+ ++i );
				count++;
			}
			
		}
		if(count == 0)
		{
			System.out.println("Key is Not present in array " );
		}
		else
		{
			System.out.println("Key is present "+ count +"time in array" );
		}
		*/
		
		
		//                         OR
		
		
		boolean inarray = false;
		for(int element:array2)
		 {
			 if(key == element)
			 {
				 inarray = true;
				 break;
			 }
		 }
		 if(inarray)
		{
			System.out.println("Key is present in array" );
		}
		else
		{
			System.out.println("Key is Not present in array " );
		}
	}
}