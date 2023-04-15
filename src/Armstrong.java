import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args)
    {

        System.out.println("Enter the 3 digit number :");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b,c;
        int digit1,digit2,digit3;


            digit1 = a % 10;
            System.out.println(digit1 );
            b = a / 10;
            digit2 = b % 10;
            System.out.println(digit2 );
            c = b / 10;
            digit3 = c % 10;
            System.out.println(digit3 );
            int arms=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
            System.out.println(arms);
            if(arms==a)
            {
                System.out.println("Given number is a Armstrong number");
            }
            else
            {
                System.out.println("Given number is not a Armstrong number");
            }




    }
}
