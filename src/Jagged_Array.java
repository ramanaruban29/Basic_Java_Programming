public class Jagged_Array
{
    public static void main(String[] args) {
        int a[][]={
                {10,20,30,40},
                {10,20,30,},
                {10,20,30,50}
        };
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(""+a[i][j]);
            }
        for(int k[]:a)
        {
            for(int l:k)
            {
                System.out.println(" "+l);
            }
            System.out.println("");
        }
    }
}
