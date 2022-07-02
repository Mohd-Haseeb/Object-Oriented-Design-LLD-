package DesignPatterns.observerPattern;

public class User implements ISubscriber {
    private int userId;
    public User(int id) {
        super();
        this.userId = id;
    }

    @Override
    public void Notify(String message) {
        // TODO Auto-generated method stub
        System.out.println("User with id "+ this.userId +" has received the notification!!!");
    }
}
