import java.util.Scanner;

public class if_else
{
    public static void main(String[] args)
    {
        int age;

        Scanner S= new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int a = S.nextInt();
        if(a>80)
        {
            System.out.println("You are about to die, be careful");
        }
        else if(a>18 && a<50)
        {
            System.out.println("You are in your middle ages");
        }
        else
        {
            System.out.println("YOu are too old, take a rest");
        }

    }
}
