
package fundamental;


public class WorkingWithString {
    public static void main(String[] args) {
        //declaring string
        
        //using literal
        String str1 = "Hello";
        
        System.out.println(str1);
        
        //using object
        String str2 = new String("World");
        System.out.println(str2);
        
        //concatenating string
        String str3 = str1 + " " + str2;
        System.out.println(str3);
        
        
        //string methods
        System.out.println(str3.length());
        System.out.println(str3.charAt(2));
        System.out.println(str1.concat(str2));
        System.out.println(str3.subSequence(0, 5));
        System.out.println(str1.equals("Hello"));
        System.out.println(str3.contains("ld"));
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        System.out.println(str3.trim());
                
        
        
        
    }
}
