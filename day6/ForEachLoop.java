class  ForEachLoop
{
	public static void main(String arg[])
	{
		// Displaying the Array in Reverse order (for loop)
		float  marks[] = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        System.out.println(marks.length);
		System.out.println("Printing using for-each loop");
        for(float element: marks){
            System.out.println(element);
        }
	}
}