class RectangleShape
{
    int length,width;

    public RectangleShape()
    {
        length=2;
        width=10;
    }
    int area()
    {
        int a =length*width;
        return a;
    }

}

public class Constructor {
    public static void main(String[] args)
    {
        RectangleShape o =new RectangleShape();
        System.out.println("Area of Rectangle:"+o.area());
    }
}
