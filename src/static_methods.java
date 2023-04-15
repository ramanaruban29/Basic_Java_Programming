
class staticTest
{
    static int a =10;
    static int b=20;

    void show()
    {
        System.out.println("Value of a :"+a+" Value of b :"+b);
    }
    static void display()
    {
        System.out.println("Value of a :"+a+" Value of b :"+b);
    }

}
public class static_methods
{
    public static void main(String[] args) {
        staticTest o1= new staticTest();
        o1.show();
        o1.display();
    }
}
