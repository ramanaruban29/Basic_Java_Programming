import java.util.Scanner;

public class sum_average_n_numbers {
    public static void main(String[] args) {
        System.out.println("Enter the limit :");
        Scanner scn=new Scanner(System.in);
        int a =scn.nextInt();

        int b=0;

        for(int i=1;i<=a;i++)
        {
            b=b+i;



        }
        System.out.println("Sum of " +a +" numbers ="+b);
        int c=b/a;
        System.out.println("Avg of " +a +" numbers ="+c);
    }
}
