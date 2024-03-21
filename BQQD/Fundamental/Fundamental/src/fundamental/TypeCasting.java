
package fundamental;


public class TypeCasting {
    public static void main(String[] args) {
        int intValue = 100;
        
        //implicit Type cast
        long longValue = intValue;
        double doubleValue = longValue;
        
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(doubleValue);
        
        //explicit type case
        
        double doubleValue2 = 233.5;
        int intValue2  = (int)doubleValue2;
        
        System.out.println(intValue2);
    }
}
