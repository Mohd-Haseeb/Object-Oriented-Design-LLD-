package DesignPatterns.singletonPrinciple;

public class Logger {
    static int noOfInstances = 0;
    private static Logger loggerInstance = null;
    private Logger() {
        super();
        Logger.noOfInstances++;
        System.out.println("Instance of Logger class is created!!");
        System.out.println("Total instances created => "+Logger.noOfInstances);
    }

    public static Logger getLogger(){
        if(loggerInstance==null) loggerInstance = new Logger();
        return loggerInstance;
    }

    public void Log(String message){
        System.out.println(message);
    }
}
