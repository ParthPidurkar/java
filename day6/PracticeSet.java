class PracticeSet
{
	public static void main(String args[])
	{
		// Practice Problem 1
		/*for(int i=4;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}*/
		
		// Practice Problem 2
		/*int sum = 0;
		int n=10;
		while(n != 0)
		{
			sum = sum + (2*n);
			n--;
		}
		System.out.print(sum);*/
		
		// Practice Problem 3
		/*int n=5;
		for(int i = 1;i<=10;i++)
		{
			System.out.println(n*i);
		}*/
		
		
		// Practice Problem 4
		/*int n=10;
		for(int i = 10;i<=1;i--)
		{
			System.out.println(n*i);
		}*/
		
		
//        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
//        for(int i=10;i>=1;i--){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

        // Practice Problem 5
//        int n = 5;
//        // What is factorial n = n * n-1 * n-2 ..... 1
//        // 5! = 5*4*3*2*1 = 120
//        int i = 1;
//        int factorial = 1;
//        while(i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);


        // Practice Problem 6
        int n = 8;
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum += n*i;
       }
        System.out.println(sum);
	}
}