class Rectangle
{
    int length,width;

    void getDetails(int x,int y)
    {
        length=x;
        width=y;

    }
    int area()
    {
        int a=length*width;
        return a;
    }
}

public class Class_Object {
    public static void main(String[] args)
    {
        Rectangle o1=new Rectangle();
        o1.length=10;
        o1.width=20;
        System.out.println("Area of Rectangle = "+o1.area());
        o1.getDetails(30,20);
        System.out.println("Area of Rectangle = "+o1.area());
    }
}
