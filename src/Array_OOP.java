import java.util.Scanner;
import java.util.Arrays;

public class Array_OOP
{
    public static int[] sortArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Limit: ");
        int n=in.nextInt();
        int[] a =new int[n];
        for(int  i=0;i<n;i++)
        {
            System.out.println("Enter the value"+i+" : ");
            a[i]=in.nextInt();

        }
        Arrays.sort(a);
        return a;  //returning array
    }

    public static void main(String[] args) {
        int arr[]=sortArray();
        for(int a:arr)
        {
            System.out.println(a);
        }
    }
}
