package fundamental;
import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        boolean isAuthenticated = true;
        
        //if statements
        if(!isAuthenticated)
            System.out.println("Not LoggedIn");
        if(isAuthenticated)
            System.out.println("LoggedIn");
        
        //if-else statements
        if(isAuthenticated)
            System.out.println("LoggedIn");
        else
            System.out.println("Not LoggedIN");
        
        //if-else-if statements
        float sellingPrice = 1200, costPrice = 1000;
        
        if(sellingPrice > costPrice)
            System.out.println("Profit");
        else if(sellingPrice < costPrice)
            System.out.println("Loss");
        else
            System.out.println("Even");
        
        //switch statements
        Scanner input = new Scanner(System.in);
        
        //messsage
        System.out.println("Admin gets full access");
        System.out.println("Sub admin gets access to create and delete courses");
        System.out.println("Test prep gets access to create and delete tests");
        System.out.println("User gets access to consume content");
        
        //prompting the user
        System.out.println("Enter your choice");
        String user = input.nextLine();
        
        //switch statement
        switch(user){
            case "admin":
                 System.out.println("Gets full access");
                 break;
            case "subadmin":
                System.out.println("Get access to create and delete courses");
                break;
            case "testprep":
                System.out.println("Gets access to create and delete tests");
                break;
            case "user":
                System.out.println("Gets access to consume courses");
                break;
            default:
                System.out.println("You are a trail user");
                break;
            
        
        }
        
    }
}
