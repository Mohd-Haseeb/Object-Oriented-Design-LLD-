package DesignPatterns.observerPattern;

public class Main {
    public static void main(String[] args) {
        
        Group group = new Group();

        User user1 = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);

        group.subscribe(user1);
        group.subscribe(user2);
        group.subscribe(user3);

        group.notifyAll("Message");
        
        group.unSubscribe(user1);
        System.out.println("--------------------");
        group.notifyAll("Message");
    }
}
