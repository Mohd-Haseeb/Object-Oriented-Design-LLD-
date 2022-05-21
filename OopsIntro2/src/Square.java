package OopsIntro2.src;

public class Square extends Shape {
    int side;

    public Square() {
        super();
        side = 4;
    }

    @Override
    public int area(){
        return side*side;
    }
}
