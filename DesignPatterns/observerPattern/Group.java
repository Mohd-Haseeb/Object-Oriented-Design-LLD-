package DesignPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<User> users = new ArrayList<>();

    public void subscribe(User user){
        this.users.add(user);
    }

    public void unSubscribe(User user){
        this.users.remove(user);
    }

    public void notifyAll(String msg){
        for (User user : users) {
            user.Notify(msg);
        }
    }

}
