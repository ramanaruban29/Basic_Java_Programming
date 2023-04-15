import java.util.Scanner;

public class Getting_inputs {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Please input 2 numbers");
        float a,b,c;
        a=in.nextFloat();
        b=in.nextFloat();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Result : "+c);



    }
}
