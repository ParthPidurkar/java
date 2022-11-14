class evenodd
{
		public static void main (String args[])
	{
		int a =100;
		 System.out.println("Even Number:-");
	    for(int i = 1; i <= a; i++)
	    {
		    if(i % 2 ==0)
		    {
			    System.out.print(i+ " ");
		     }
	    }
	    System.out.println("Odd Number:- ");
	    for(int i = 1; i <= a; i++)
	    {
	        if(i % 2 !=0)
			    {
			    	System.out.print(i+ " "); 
			    }
	    }
	}
}