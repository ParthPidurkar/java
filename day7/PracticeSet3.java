class PracticeSet3
{
	public static void main(String arg[])
	{
		//problem 3: Finding the Average of marks
		float array1[] =  {80.6f,67.7f,76.7f,86.0f,77.6f};
		 float sum = 0;
		 for(float marks:array1)
		 {
			 sum = sum + marks;
		 }
		System.out.println("The average value = " + sum/array1.length);
	}
}