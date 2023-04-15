import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args) {
        System.out.println("Enter the limit :");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int d = -1;
        int e = 1;
        int c;
        for (int i = 1; i <= a; i++) {
            c = d + e;
            System.out.println(c);
            d = e;
            e = c;


        }
    }
}
