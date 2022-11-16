class Employee {

  protected double sal = 50000;
}

class Fulltime extends Employee {

  private double ftsal;

  double display() {
    ftsal = sal * 1.5;
    return ftsal;
  }
}

class Intern extends Employee {

  private double ptsal;

  double display() {
    ptsal = sal * 1.25;
    return ptsal;
  }
}

public class Salary {

  public static void main(String args[]) {
    Fulltime f = new Fulltime();
    Intern i = new Intern();
    System.out.println("Salary of Fulltime employee : " + f.display());
    System.out.println("Salary of Intern : " + i.display());
  }
}
