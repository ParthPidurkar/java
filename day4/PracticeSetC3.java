class PracticeSetC3
{
	public static void main(String args[])
	{
		/*//Problem 1
        String name = "PARTH PIDURKAR";
        name = name.toLowerCase();
        System.out.println(name);
		//Problem 2
        String name = "parth pidurkar";
        name = name.toUpperCase();
        System.out.println(name);*/
		//Problem 3
        String text = "PARTH PIDURKAR";
        text = text.replace(" ","_");
        System.out.println(text);
		// Problem 4
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Parth");
        System.out.println(letter);
		// Problem 5
        String myString =  "This string contains double and  triple   spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
		
		
	}
}