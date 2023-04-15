class Father //Base class
{
    public void house()
    {
        System.out.println("Have Own 2 Houses");
    }
}
class Son extends Father //Derived Class
{
    public void car()
    {
        System.out.println("Have own Audi car.");
    }
}
public class Inheritance
{
    public static void main(String[] args)
    {
        Son o=new Son();
        o.car();
        o.house();
    }
}

