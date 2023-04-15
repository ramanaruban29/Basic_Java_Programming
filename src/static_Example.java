class inbuilt_function
{
    public static int power(int base,int power)
    {
        int result=1;
        for(int i=1;i<=power;i++)
        {
            result*=base;

        }
        return result;
    }
}
public class static_Example
{
    public static void main(String[] args) {
        System.out.println("Power: "+ inbuilt_function .power(2,3));
    }
}
