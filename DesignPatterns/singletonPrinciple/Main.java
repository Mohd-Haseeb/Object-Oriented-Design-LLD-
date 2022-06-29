package DesignPatterns.singletonPrinciple;

public class Main {
    public static void main(String[] args) {
        
        // Single design pattern => only one object of the class must be created
        // Ex: Logger, db connection

        // The entire concept of SINGLETON revolves around, there should be only one INSTANCE?
        // -> We first make the constructor private.
        // -> create a static function in Logger which returns instance of the class.



        // But, this below approach is NOT THREAD SAFE.
        Logger logger1 = Logger.getLogger();

        logger1.Log("User 1 is logged in");


        Logger logger2 = Logger.getLogger();

        logger2.Log("User 2 is logged in");

     

        /* 
        Logger logger1 = new Logger();
        logger1.Log("This is from user 1");
        
        Logger logger2 = new Logger();
        logger2.Log("This is from user 1");
            => We shuldn't be able to create multiple instances.
        */

    }



}
