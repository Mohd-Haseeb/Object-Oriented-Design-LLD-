package OopsIntro2.utils;

import OopsIntro2.src.Human;

public class Main {
    public static void main(String[] args) {
        Human h2 = new Human();
        Male m2 = new Male();

        System.out.println("From utils package:Main -> Age : "+h2.age);
        // weight is PROTECTED : cannot be accessed in another package
        // System.out.println(h2.weight);

        System.out.println(m2.age);
        // System.out.println(m2.weight);
    }
}
