
class Father1 //Base class
{
    public void house()
    {
        System.out.println("Have Own 2 Houses");
    }
}
class Son1 extends Father1 //Derived Class
{
    public void car()
    {
        System.out.println("Have own Audi car.");
    }
}
class Grandson extends Son1 //Derived Class
{
    public void cycle()
    {
            System.out.println("Have own Bicycle.");
    }
}
public class Multilevel_Inheritance
{
    public static void main(String[] args)
    {
        Grandson s=new Grandson();
        s.car();
        s.house();
        s.cycle();

    }
}



