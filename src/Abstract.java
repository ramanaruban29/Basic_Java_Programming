abstract class Shape
{
    abstract void draw();
    void message()
    {
        System.out.println("Message from shape");
    }

}
class rectangle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Draw rectangle using the length and bredth...");
    }
}


public class Abstract
{
    public static void main(String[] args)
    {
        rectangle o=new rectangle();
        o.draw();
        o.message();

    }
}
