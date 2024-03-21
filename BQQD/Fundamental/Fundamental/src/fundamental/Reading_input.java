
package fundamental;
import java.util.Scanner;

public class Reading_input {
    public static void main(String[] args) {
        //Reading input from user
        //creating a an input object of type Scanner
        Scanner input = new Scanner(System.in);
        
        //prompting the user
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        //prompting the user for input
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        //prompting the user for input
        System.out.print("Enter your gender(M/F): ");
        char gender = input.next().charAt(0);
        
        //prompting the user for input
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
        
        //printing the inputted value
        System.out.println("User Detials...");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
        
    }
}
