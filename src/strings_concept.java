public class strings_concept
{
    public static void main(String[] args) {
        String a="Tutor Code";
        String b="Tutor Code";
        System.out.println("A :"+a);
        System.out.println("A :"+b);

        System.out.println("A HashCode"+a.hashCode());
        System.out.println("A HashCode"+a.hashCode());
        System.out.println("Equals : "+a.equals(b));
        System.out.println("Equals Ignore Case: "+a.equalsIgnoreCase(b));
        System.out.println("Length: "+a.length());
        System.out.println("charAt: "+a.charAt(0));
        System.out.println("Uppercase: "+a.toUpperCase());
        System.out.println("Lowercase: "+a.toLowerCase());
        System.out.println("Replace: "+a.replace("Code", "Stanley"));
        System.out.println("Contains :"+a.contains("COde"));
        System.out.println("Empty: "+a.isEmpty());
        System.out.println("Ends with :"+a.endsWith("de"));
        System.out.println("Starts with : "+a.startsWith("Tut"));
        System.out.println("Substring: "+a.substring(0,5));
        char [] carray=a.toCharArray();
        for(char c : carray)
        {
            System.out.println(c);
        }
        String c="Tutor";
        System.out.println("Trimmed letter:"+c.trim());
    }



}
