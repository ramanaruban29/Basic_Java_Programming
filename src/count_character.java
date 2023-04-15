public class count_character {
    public static void main(String[] args) {
        StringBuilder a= new StringBuilder("Ram-age is 12@");
        System.out.println(a);
        int upper=0,lower=0, space=0, number=0,vowels=0;

        for(int i=0; i<a.length();i++)
        {
           if(a.charAt(i)>=97 && a.charAt(i)<=122)
           {
               lower++;
           }
            if(a.charAt(i)>=65 && a.charAt(i)<=90)
            {
                upper++;
            }
        }
        System.out.println("Lowercase : "+lower);
        System.out.println("Uppercase : "+upper);

    }
}
