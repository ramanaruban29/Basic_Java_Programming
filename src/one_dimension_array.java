public class one_dimension_array {
    public static void main(String[] args) {
        int a []={10,20,30,40,50,60,70,100};
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        for(int element:a)
        {
            System.out.println(element);
        }

        int b[]=new int[10];

        for(int ele:b)
        {
            System.out.println(ele);
        }


    }
}
