class  ArrayOperation
{
	public static void main(String arg[])
	{
		float  marks[] = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        System.out.println(marks.length);
        
		// Displaying the Array (Naive way)
        System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
		
		//Displaying the Array (For loop)
		System.out.println("Printing using Loop");
		for(int i=0;i<5;i++)
		{
			System.out.println(marks[i]);
		}
        
		
		 // Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for(int i=0;i<marks.length;i++)
		{
            System.out.println(marks[i]);
        }
	}
}