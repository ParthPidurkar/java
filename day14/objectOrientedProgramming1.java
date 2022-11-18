
	class Empolyee
	{
		void printdata(int Empolyee_id,String Name,double Salary)
		{
			System.out.println("Name :" + Name);
			System.out.println("Empolyee_id :" + Empolyee_id);
			System.out.println("Salary :" + Salary);
			
		}
	}

class objectOrientedProgramming1
{
	public static void main(String arg[])
	{
		Empolyee c1 = new Empolyee();
		int Empolyee_id = 2002;
		String Name = "parth";
		double Salary = 96552.54785;
		c1.printdata(Empolyee_id,Name,Salary);
		
	}
}