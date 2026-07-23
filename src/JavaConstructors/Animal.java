package JavaConstructors;

public class Animal {

    Animal(){
        System.out.println("Parent class constructor called");
    }
}

class Dog extends Animal{

    Dog(){
        System.out.println("Child class constructor called");
    }

    public static void main(String[] args) {

        Dog dog =new Dog();
        //Whenever the child object is created
        // the parent class constructor will be called implicitly using super()
    }
}
