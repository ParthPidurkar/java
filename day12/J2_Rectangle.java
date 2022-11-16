public class J2_Rectangle {

  public static void main(String args[]) {
    Rectangle r = new Rectangle();
    System.out.println(" Area of 1st Rectangle: " + r.area1());
    System.out.println(" Area of 2nd Rectangle: " + r.area2());
  }
}

class Rectangle {

  private int l1, b1, l2, b2;

  Rectangle() {
    l1 = 4;
    b1 = 5;
    l2 = 5;
    b2 = 8;
  }

  public float area1() {
    return l1 * b1;
  }

  public float area2() {
    return l2 * b2;
  }
}


