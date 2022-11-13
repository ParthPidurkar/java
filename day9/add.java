import java .util.*;
class add
{
int a,b;
void getdata()
{
System.out.print("Enter the first number");
a = sc.nextInt();
System.out.print("Enter the second number");
b = sc.nextInt();
}
void show()
{
System.out.print("addition ="+(a+b));
}
public static void main (String args[])
{
Scanner sc= new Scanner(System.in);
add a = new add();
a.getdata();
a.show();
}}

