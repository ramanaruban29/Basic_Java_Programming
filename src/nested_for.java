import java.util.Scanner;

public class nested_for
{
    public static void main(String[] args) {
        System.out.println("Enter the limit :");
        Scanner scn=new Scanner(System.in);
        int a =scn.nextInt();
        for(int i=0;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
