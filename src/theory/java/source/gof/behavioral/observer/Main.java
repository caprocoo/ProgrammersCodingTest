package theory.java.source.gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Notice notice = new Notice();
        User1 user1 = new User1("유저1");
        User2 user2 = new User2("유저2");

        notice.attach(user1);
        notice.attach(user2);

        String msg = "공지사항입니다.";
        notice.notifyObservers(msg);

        notice.detach(user1);
        msg = "공지사항 끝!";
        notice.notifyObservers(msg);
    }
}
class Observer{
    public String msg;

    public void receive(String msg) {
        System.out.println(this.msg + "에서 메시지를 받음 : " + msg);
    }
}

class User1 extends Observer {
    public User1(String msg) {
        this.msg = msg;
    }
}
class User2 extends Observer {
    public User2(String msg) {
        this.msg = msg;
    }
}

class Notice{
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String msg) {
        for (Observer o: observers
             ) {
            o.receive(msg);
        }
    }
}