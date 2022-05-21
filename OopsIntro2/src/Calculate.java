package OopsIntro2.src;

public class Calculate {
    // Encapsulation -> we can make data members read only by not creating its SETTER method.
    // Read Only and Write Only classes can be made by using Encapsulation
    private int length = 10;
    private int breadth = 5;

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }

    public int getBreadth(){
        return this.breadth;
    }

    public void setBreadth(int breadth){
        this.breadth = breadth;
    }


}
