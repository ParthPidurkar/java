import java.util.*;

public class J1_Students {

  public static void main(String args[]) {
    Student s1 = new Student();
    s1.setdetails();
    s1.printdetails();
  }
}

class Student {

  private int roll;
  private float total, percentage;
  private String name;

  public float setdetails() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Name: ");
    name = sc.nextLine();
    System.out.println("Enter your Roll No: ");
    roll = sc.nextInt();
    System.out.println("Enter your Total Marks: ");
    total = sc.nextFloat();
    percentage = (total / 500) * 100;
    return percentage;
  }

  public void printdetails() {
    System.out.println("Name: " + name);
    System.out.println("Roll No: " + roll);
    System.out.println("Total Marks: " + total);
    System.out.println("Percentage: " + percentage);
  }
}
