class Shape{
    public void display(int l, int b){
        int a = l+b;
        System.out.println("The value of l+b is " +a);
    }
}
class Rectangle extends Shape{
    public void display(int l, int b){
        int c = l-b;
        System.out.println("The value of l-b is " +c);
    }
}
class Square extends Shape{
    public void display(int l, int b){
        int d = l*b;
        System.out.println("The value of l*b is " +d);
    }
}
public class Overriding{
    public static void main(String args[]){
        System.out.println("Name: Parth Pidurkar \n Batch: A1 \n  Section B \n Roll no: 64");
        System.out.println("Aim: Write a program to implement Polymorphism (Overriding)");
        Shape S = new Shape();
        S.display(1, 20);
        S = new Rectangle();
        S.display(10, 20);
        S = new Square();
        S.display(20, 30);
    }
}
