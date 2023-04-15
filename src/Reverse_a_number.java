import java.util.Scanner;

public class Reverse_a_number
{
    public static void main(String[] args) {
        System.out.println("Enter the limit :");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int rev=0;
        int rem;
        while(a!=0)
        {
            rem=a%10;
            rev=(rev*10)+rem;
            a=a/10;

        }
        System.out.println("Reversed Number: "+ rev);

    }
}
