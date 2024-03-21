package fundamental;
import java.util.Scanner;

class Student{
    Scanner input = new Scanner(System.in);
    //properties
    int studentid;
    String studentName;
    int studentAge;
    
    //constructor
    
    public Student(){
        this.studentid = 100;
        this.studentName = "Khan";
        this.studentAge = 9;
    }
    
    public Student(int sid, String name, int age){
        this.studentName = name;
        this.studentAge = age;
        this.studentid = sid;
    }
    
    //methods
    public void acceptDetials(){
        System.out.print("Enter student ID: ");
        studentid = input.nextInt();
        
        System.out.print("Enter student name: ");
        studentName = input.next();
        
        System.out.print("Enter student age: ");
        studentAge = input.nextInt();
    }
    
    public void displayDetials(){
        System.out.println("Student ID: " + studentid);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }
}

class Marks extends Student{
    private float objectiveMarks;
    private float subjectiveMarks;
    
    public void acceptDetials1(){
        System.out.print("Enter objective marks: ");
        objectiveMarks = input.nextFloat();
        
        System.out.print("Enter subjective marks: ");
        subjectiveMarks = input.nextFloat();
    }
    
    public void displayDetials1(){
        System.out.println("Student objective marks: " + objectiveMarks);
        System.out.println("Student subjective marks: " + subjectiveMarks);
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        
        Marks marks = new Marks();
        marks.acceptDetials();
        marks.acceptDetials1();
        marks.displayDetials();
        marks.displayDetials1();
    }
 
}
