class Super
{
    public void display()
    {
        System.out.println("I am super Display");
    }
    final void finalDisplay()
    {
        System.out.println("I am super excited");
    }
}

class Sub extends Super
{
    public void display()
    {
        System.out.println("I am sub display");
    }
}
public class FinalMethods
{
    public static void main(String[] args) {

        Sub s1=new Sub();
        s1.display();
        s1.finalDisplay();
    }
}
