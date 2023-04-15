class OuterClass
{
    static int x=10;
    static int y=20;
    static class InnerClass
    {
        void display()
        {
            System.out.println("X:"+x);
        }
    }
}

public class StaticInnerclass
{
    public static void main(String[] args) {
        OuterClass.InnerClass i= new OuterClass.InnerClass();
        i.display();
    }
}
