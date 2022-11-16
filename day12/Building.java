class Room {

  protected int l, b;

  Room() {
    l = 100;
    b = 80;
  }

  Room(int len, int br) {
    l = len;
    b = br;
  }

  public float area() {
    return (l * b);
  }
}

class Bedroom extends Room {

  private int h;

  Bedroom() {
    h = 120;
  }

  Bedroom(int ht, int len, int br) {
    super(len, br);
    h = ht;
  }

  public float volume() {
    return (l * b * h);
  }
}

public class Building {

  public static void main(String args[]) {
    Bedroom b1 = new Bedroom(120, 65, 49);
    System.out.println("Area of Bedroom is: " + b1.area());
    System.out.println("Volume of Bedroom is: " + b1.volume());
  }
}
