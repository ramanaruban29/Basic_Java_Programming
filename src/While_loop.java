import java.util.Scanner;

public class While_loop
{
    public static void main(String[] args) {
        System.out.println("Enter the limit :");
        Scanner scn=new Scanner(System.in);
        int a =scn.nextInt();
        int i=0;
        while(i<=a)
        {
            System.out.println(i);
            i++; //i=i+1
        }
    }
}
