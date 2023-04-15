import java.util.Scanner;

public class nested_if
{
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.println("Enter Your Marital Status (M/U): ");
        char marital = S.next().charAt(0);
        int age = S.nextInt();
        if ((marital == 'u' || marital == 'U')) {
            System.out.println("You are single, commmit faster ");
        }
        else if ((marital == 'm' || marital == 'M') && age>18)
        {
            System.out.println("You are married");
        }
        else
        {
            System.out.println(" Invalid Input");
        }
    }
}
