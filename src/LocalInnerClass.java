
class Outercls
{
    void display()
    {
        class Inner //Inner clas only works inside this scope
        {
            void innerDisplay()
            {
                System.out.println("Inner Display");
            }
        }
        Inner i=new Inner();
        i.innerDisplay();
    }

}
public class LocalInnerClass
{
    public static void main(String[] args)
    {
        Outercls o=new Outercls();
        o.display();

    }
}
