import java.util.Scanner;

public class Switch
{
    public static void main(String[] args)
    {
      int a,b,c,ch;
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        Scanner S = new Scanner(System.in);
        System.out.println("Pls,Enter your Choice..");
        a = S.nextInt();
        System.out.println("Pls,Enter num1:");
        b = S.nextInt();
        System.out.println("Pls,Enter num2:");
        c = S.nextInt();

        switch(a)
        {
            case 1:
                System.out.println("Addition:"+ (b+c));
                break;
            case 2:
                System.out.println("Substraction:"+ (b-c));
                break;
            case 3:
                System.out.println("Multiplication:" +(b*c));
                break;
            case 4:
                System.out.println("Division:" +(b/c));
                break;
            default:
                System.out.println("Invalid input");
         }


    }
}
