import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        int e=0,d=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter a["+i+"] value : ");
            a[i] =in.nextInt();
        }
        for (int element :a)
        {
            if(element%2==0)
            {
                e++;
            }
            else
            {
                d++;
            }

        }
        System.out.println("total no of odd numbers"+e);
        System.out.println("total no of odd numbers"+d);
    }
}
