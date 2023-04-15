
class demo
{
    private int m,n;

    demo(int x,int y)
    {
        m=x;
        n=y;
    }
    int largest()
    {
        if(m>n)
        {
            return m;
        }
        else
        {
            return n;

        }
    }
    void display()
    {
        int large =largest();
        System.out.println("The Greatest number is : "+large);
    }
}


public class Nesting_of_methods
{
    public static void main(String[] args)
    {
        demo o=new demo(10,20);
        o.display();

    }
}
