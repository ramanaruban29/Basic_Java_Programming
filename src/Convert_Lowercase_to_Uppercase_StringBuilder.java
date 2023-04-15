public class Convert_Lowercase_to_Uppercase_StringBuilder {
    public static void main(String[] args) {
        StringBuilder a= new StringBuilder("abc");
        System.out.println("Original Input : "+a);
        for(int i=0;i<a.length();i++) //97-122
        {
            if(a.charAt(i)>=97 && a.charAt(i) <=122)
            {
                int c=(int)a.charAt(i)-32; //97-32=65 98-32=66 99-32=67
                a.setCharAt(i,(char)c); //ABC
            }
        }
        System.out.println("Uppercase Output: "+a);
    }
}
