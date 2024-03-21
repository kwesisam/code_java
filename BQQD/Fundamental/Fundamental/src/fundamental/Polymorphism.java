package fundamental;

 
class Calculation{
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    
    public static int addition(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    
    public static double addition(float num1, float num2){
        return num1 + num2;
    }
    
    public static float addition(int num1, float num2){
        return num1 + num2;
    }
    
    public static float addition(float num1, int num2){
        return num1 + num2; 
    }
}

class Person{
     String name;
     int age;
     Person(String name, int age){
         this.name = name;
         this.age = age;
     }
     
     
     public void print(){
         System.out.println("Name: " + this.name);
         System.out.println("Age: " + this.age);
     }
     
     
}

class Employee extends Person{
    String designation;
    float salary;
    public Employee(String name, int age,String designation, float salary){
        super(name,age);
        this.designation = designation;
        this.salary = salary;
    }
    
    public void print(){
        super.print();
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Employee employee = new Employee("Daniel", 20, "Manager", 4000);
        System.out.println(calculation.addition(2,2));
        System.out.println(calculation.addition(20,20,20));
        System.out.println(calculation.addition(4.4F,3.5F));
        System.out.println(calculation.addition(3,4.5F));
        System.out.println(calculation.addition(3.4F,5));
    
        employee.print();
    }
}
