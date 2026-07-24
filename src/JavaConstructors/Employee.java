package JavaConstructors;

// The need for constructor chaining
public class Employee {

    String name;
    int age;

    //this() - within the same class
    public Employee(){
        System.out.println("Default constructor called");
    }

    public Employee(String name){
        this.name = name;
        System.out.println("Parameterized constructor called with name param");
    }

    public Employee(String name, int age){
//        this.name = name;  //intializing same name var here again
        this(name);   // reusing code
        this.age = age;
        System.out.println("Parameterized constructor called with name and age params");
    }

    static void main() {
        Employee e1 = new Employee("Sneha", 34);
    }
}
