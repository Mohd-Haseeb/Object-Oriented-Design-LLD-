public class Main{
    public static void main(String[] args) {
        System.out.println("Mohd Haseeb!!");
        // System.out.println("Count before creating any object : "+Human.count);
        // Human haseeb = new Human();
        // Human haseeb2 = new Human(32);
        // haseeb.age = 24;
        // System.out.println("Age is "+haseeb2.age);
        // System.out.println("Age is "+haseeb.age);
        // haseeb.sleep();

        // System.out.println("Count of Objects : "+ Human.count);

        // Child c1 = new Child();
        // c1.eat();

        // ChildTwo c2 = new ChildTwo(); // Hierarchical Inheritance
        // c2.eat();

        // GrandChild gc1 = new GrandChild();
        // gc1.sleep();

        Scorpio s1 = new Scorpio(); // Multi-level inheritance
        s1.runCar();
        s1.runCar(40); // Method-Overloading(compile time polymorphism)
        s1.intro(); // Method-Overriding(run time polymorphism)
    }


}

class Human{
    
    // Properties
    int age;
    int weight;

    // Static is a member of a class, not object. Should be accessed using Class Name. Ex: Human.count
    static int count = 0; // represents no. of objects called

    // Constructor -> 3 types
    // Default, Non parameterized and Parameterized
    // Rules of a construcor : 1. No return type 2. name == Class namen3. No Abstract, Static, Final but can be Private.

    public Human(){
        // this(32);
        count++ ;
        System.out.println("Insided No parameterized constructor!!");
    }

    // constructor overloading -> Having same name but different parameters. Cannot make another constructor with one int parammeter.
    public Human(int age){
        this(); // accessing constructor . this represents current object
        count++ ;
        this.age = age;
        System.out.println("Inside single parameter constructor");
    }


    // methods
    void sleep(){
        System.out.println("Sleeping method is invoked!!");
    }

    void eat(){
        System.out.println("Eat() method is invoked!!");
    }

    // static method can only change a static data method
    static void update(){
        // this.age++; -> Error. Not a static member
        count++;
    }
  
}

// single level inheritance
class Child extends Human{

}

class ChildTwo extends Human{

}

// Multi level inheritance
class GrandChild extends Child{

}

class Car{
    String color;
    int weight;

    void runCar() {
        System.out.println("Car is on drive mode!!");
    }

    //POLYMORPHISM
    // Method Overloading/ Compile-time polymorphism
    // Class with many methods of same name but with different parameters(types or no. of parameters)
    void runCar(int speed) {
        System.out.println("Car is on drive mode and running at spped "+speed+" kms !!!");
    }

    

    void stopCar() {
        System.out.println("Car is stopped");
    }
}

class Mahindra extends Car {
    int rating;

    void intro(){
        System.out.println("This is Mahindra.");
    }
}

class Scorpio extends Mahindra{

    // POLYMORPHISM
    // Method-Overriding or Run time polymorphism
    // overriding intro() method od Parent(Mahindra)
    @Override
    void intro(){
        System.out.println("This is Scorpio. Coming alive by overriding Mahinndra");
    }

}