import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {

        System.out.println("Enter the number :");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for (int i = 2; i < a; i++) {

            if (a % i == 0) {
                System.out.println("Not a Prime Number");
                break;
            } else {
                System.out.println("It is a prime number");
                break;
            }
        }
    }
}
