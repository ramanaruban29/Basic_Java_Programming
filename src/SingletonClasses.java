
class ABC
{
    static ABC obj =null;
    private ABC()
    {

    }
    public static ABC getInstance()
    {
        if(obj==null)

            obj=new ABC();
        return obj;

    }
    void display()
    {
        System.out.println("I am Ramna");
    }
}

public class SingletonClasses
{
    public static void main(String[] args) {
        ABC o1=ABC.getInstance();
        o1.display();

    }
}
