interface Animal
{
     void Sound();
     void sleep();

}
interface Food
{
    void taste();
    void smell();
}

class Dog implements Animal,Food //Multiple Inheritance
{

    @Override
    public void Sound()
    {
        System.out.println("The dog barks and make sound");

    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps between it's paws");

    }

    @Override
    public void taste() {
        System.out.println("Dog's food tastes better than human's");
    }

    @Override
    public void smell() {
        System.out.println("Dog's food smells good");

    }
}


public class Interface
{
    public static void main(String[] args)
    {
        Dog o=new Dog();
        o.sleep();
        o.Sound();
        o.smell();
        o.taste();


    }
}
