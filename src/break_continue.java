import java.util.Scanner;

public class break_continue {
    public static void main(String[] args) {
        System.out.println("Enter the limit :");
        Scanner scn=new Scanner(System.in);
        int a =scn.nextInt();
        for(int i=0;i<=a;i++)
        {
            if(i>2)
            {

                System.out.println(i);
                continue;
            }

            else if (i==8)
            {
                break;
            }


        }

    }
}
