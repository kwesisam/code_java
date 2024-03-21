
package fundamental;

public class Loops {
    public static void main(String[] args) {
        //for loop
        for (int i = 0; i <= 9; i++) {
            System.out.println("Hello World! " + i);
        }
        
        //while loop
        int i = 0;
        while(i <= 9){
            System.out.println("Hello World " + i);
            i++;
        }
        
        
        //for each loop 
        String[] names = {"Samuel", "Steve", "Monica"};
        
        for(String name : names){
            System.out.println(name);
        }
         
    }
}
