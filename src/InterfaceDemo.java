interface Demo
{
    int a=25;

    void fun1();
    void fun2();

    public static void fun3()
    {
        System.out.println("I am function 3");
    }
    default void fun5()
    {
        System.out.println("Fun-5"); // important when devloping projects when providing updates.
    }

}

interface Demo2 extends Demo
{
    void fun4();

}

class TestInter implements Demo2
{


    @Override
    public void fun1() {

    }

    @Override
    public void fun2() {

    }

    @Override
    public void fun4() {

    }
}

public class InterfaceDemo
{
    public static void main(String[] args) {
        System.out.println("A:"+Demo.a);
        Demo.fun3();
        TestInter test=new TestInter();
        test.fun1();
        test.fun5();
        test.fun2();
        test.fun4();
    }
}
