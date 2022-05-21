package OopsIntro2.src;

public abstract class Shape {

    String color;

    public Shape(){
        this.color = "Yellow";
        System.out.println("Constructor of Abstract class -> Shape");
    }

    // abstract method -> No implementation, only declarations
    abstract void area();
}
