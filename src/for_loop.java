import java.util.Scanner;

public class for_loop
{
    public static void main(String[] args) {
        System.out.println("Enter the limit :");
        Scanner scn=new Scanner(System.in);
        int a =scn.nextInt();

        for(int i=0;i<=a;i++)
        {
            System.out.println(i);
             //i=i+1
        }
    }
}
