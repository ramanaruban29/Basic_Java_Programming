//Getter and Setter
class ShapeRectangle
{
    private int length,width;
    int getLength()
    {
        return length;
    }
    int getWidth()
    {
        return width;
    }
    void setLength(int l)
    {
        length=l;
    }
    void setWidth(int w)
    {
        width=w;
    }
    int area()
    {
        int a =length*width;
        return a;
    }
}
public class Getters_Setters
{
    public static void main(String[] args)
    {
        ShapeRectangle o =new ShapeRectangle();
        o.setLength(10);
        o.setWidth(20);
        System.out.println("Area of Rectangle:"+o.area());


    }
}
