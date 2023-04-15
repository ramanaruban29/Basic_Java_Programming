import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the limit :");
        Scanner scn=new Scanner(System.in);
        int a =scn.nextInt();
        int b=1;
        for(int i=1;i<=a;i++)
        {
             b=b*i;

        }
        System.out.println("Factorial of " +a +"="+b);
    }
}
