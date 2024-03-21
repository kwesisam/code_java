
package fundamental;

public class StringBuilderBuffer {
    public static void main(String[] args) {
        
        //declaring a string buffer
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println(buffer);
        
        buffer.append(" World");
        System.out.println(buffer);
        
        System.out.println(buffer.capacity());
        
        //declaring a string builder
        StringBuilder builder = new StringBuilder("Hello");
        System.out.println(builder);
        builder.append(" World");
        System.out.println(builder);
        
    }
}
