import java.util.Scanner;

public class Strong
{
    public static void main(String[] args)
    {

        System.out.println("Enter the 3 digit number :");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b,c;
        int digit1,digit2,digit3;


        digit1 = a % 10;

        b = a / 10;
        digit2 = b % 10;

        c = b / 10;
        digit3 = c % 10;
        int fact1=1;
        int fact2=1;
        int fact3=1;

        for(int i=1;i<=digit1;i++)
        {
            fact1 = fact1 * i;

        }
        for(int i=1;i<=digit2;i++)
        {
            fact2 = fact2 * i;
        }
        for(int i=1;i<=digit3;i++)
        {
            fact3 = fact3 * i;
        }
        int m=fact1+fact2+fact3;
        System.out.println(m);
        if(m==a)
        {
            System.out.println("Given number is a Strong number");
        }
        else
        {
            System.out.println("Given number is not a Strong number");
        }

    }
}
