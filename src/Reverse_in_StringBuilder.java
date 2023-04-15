public class Reverse_in_StringBuilder {
    public static void main(String[] args) {
        StringBuilder a =new StringBuilder("Tutor Code Computer Education ");
        System.out.println(a);
        StringBuilder b=new StringBuilder();
        for(int i=a.length()-1;i>=0;i--)
        {
            b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}
