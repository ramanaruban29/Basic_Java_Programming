class MathsOperation
{
    public static int multiply(int a ,int b)
    {
        return a*b;
    }
    public static double multiply(double a ,double b)
    {
        return a*b;
    }
    public static float multiply(float a ,float b)
    {
        return a*b;
    }


}


public class Overloading
{
    public static void main(String[] args) {
        System.out.println("Multiply 2 Integer value :"+MathsOperation.multiply(25,10));
        System.out.println("Multiply 2 Integer value :"+MathsOperation.multiply(25.1,10));
        System.out.println("Multiply 2 Integer value :"+MathsOperation.multiply(25.236598,10.2589));


    }
}
