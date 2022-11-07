class StringMethods
{
	public static void main(String args[])
	{
		String name = "Parth";
		/* to find length of string
		
		int value = name.length();
		System.out.println(value);*/
		
		/* convert string in uppercase and lowercase
		
		String str1 = name.toLowerCase();
		System.out.println(str1);
		
		String str2 = name.toUpperCase();
		System.out.println(str2);*/
		
		/* to remove extra space from string
		
		String nonTrimmedString = "     Parth     ";
        System.out.println(nonTrimmedString);
		String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);*/
		
		/*to start string from certent place
		
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,5));*/
		
		
		/*to replace specific letter
		
		System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("r", "er"));*/
		
		
		/*it check the string starting and ending letters
		
		System.out.println(name.startsWith("Par"));
        System.out.println(name.endsWith("ty"));*/
		
		
		/*show the index of string
		System.out.println(name.charAt(4));*/
		
		// it is used for check string
		System.out.println(name.equals("Parth"));
		System.out.println(name.equalsIgnoreCase("parth"));
		
	}
}