public class j1_constructor {

  public static void main(String args[]) {
    Rectangle r = new Rectangle(10, 20);
    Circle c = new Circle(20);
    Triangle t = new Triangle(10, 12, 12, 8);
    System.out.println("Area of Rectangle is: " + r.area());
    System.out.println("Area of Rectangle is: " + r.perimeter());
    System.out.println("Area of Circle is: " + c.area());
    System.out.println("Area of Circle is: " + c.perimeter());
    System.out.println("Area of Triangle is: " + t.area());
    System.out.println("Area of Triangle is: " + t.perimeter());
  }
}

class Rectangle {

  private int l, b;

  Rectangle() {
    l = 5;
    b = 5;
  }

  Rectangle(int len, int brd) {
    l = len;
    b = brd;
  }

  public float area() {
    return (l * b);
  }

  public float perimeter() {
    return 2 * (l + b);
  }
}

class Circle {

  private int r;

  Circle() {
    r = 10;
  }

  Circle(int rad) {
    r = rad;
  }

  public double area() {
    return (3.142 * r * r);
  }

  public double perimeter() {
    return 2 * (3.142 * r);
  }
}

class Triangle {

  private int b, h, a, c;

  Triangle() {
    b = 5;
    h = 5;
    a = 10;
    c = 12;
  }

  Triangle(int bs, int ht, int s1, int s2) {
    b = bs;
    h = ht;
    a = s1;
    c = s2;
  }

  public double area() {
    return (0.5 * b * h);
  }

  public double perimeter() {
    return (a + b + c);
  }
}

