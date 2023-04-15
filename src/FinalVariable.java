class Test
{
    final int MIN=1;
    final int NORMAL;
    final int MAX;

    Test(int normal)
    {
        NORMAL=normal;
        MAX=100;
    }
    void display()
    {
        System.out.println("MIN :" + MIN);
        System.out.println("NORMAL :" +NORMAL);
        System.out.println("MAX :" + MAX);
    }
}

public class FinalVariable
{
    public static void main(String[] args) {
        Test t1=new Test(50);
        t1.display();
    }
}
