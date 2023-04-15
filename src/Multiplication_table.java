import java.util.Scanner;

public class Multiplication_table
{
    public static void main(String[] args) {

        System.out.println("Enter the number :");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(a + "X" + i + "=" + (a * i));

        }
    }
}
