package OopsIntro2.src;

import OopsIntro2.utils.Male;

public class Main {
    
    public static void main(String[] args) {


        // Abstraction
        


        // Encapsulation
        Calculate c1 = new Calculate();

        System.out.println(c1.getLength());
        
        c1.setLength(49);
        
        System.out.println(c1.getLength());

        // Human h1 = new Human();

        // System.out.println(h1.age);
        // h1.print();
        // System.out.println(h1.name);
        // System.out.println(h1.weight);

        // Female f1 = new Female();

        // System.out.println(f1.weight);

        Male m1 = new Male();
        System.out.println(m1.age);
        System.out.println(m1.weight);

    }
}
