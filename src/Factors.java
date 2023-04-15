import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        System.out.println("Enter the number :");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for (int i = 1; i <= 12; i++) {

            if (a % i == 0) {
                System.out.println(i);
            } else {
                continue;
            }

        }
    }
}
