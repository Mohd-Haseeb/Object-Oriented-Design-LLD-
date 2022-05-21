package OopsIntro2.src;

public abstract class Shape {

    String color;

    // we can have constructor for abstract classes
    public Shape(){
        this.color = "Yellow";
        System.out.println("Constructor of Abstract class -> Shape");
    }

    // abstract method -> No implementation, only declarations
    public abstract int area();
}
