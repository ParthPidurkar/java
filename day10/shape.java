class shape
{
    int a,b;
    shape(int a,int b)
    {
        this.a = a;
        this.b = b;
    }

    public int getArea()
    {
        return(a*b);
    }

}
class Rectangle extends shape
{
    Rectangle(int len,int br)
    {
        super(len,br);
    }
}
public class Main
{
    public static void main (String[] args) 
    {
        
        Rectangle rec = new Rectangle(34,45);
        System.out.println("Area of Rectangle is: "+ rec.getArea());
    }
}