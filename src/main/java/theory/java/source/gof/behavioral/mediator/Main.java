package theory.java.source.gof.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : theory.java.source.gof.behavioral.mediator
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-02-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-10        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {

    }
}

interface Mediator {
    void addColleague(Colleague colleague);

    void mediate(Colleague colleague);
}

class ConcreteMediator implements Mediator {
    private List<Colleague> colleagueList;

    public ConcreteMediator() {
        this.colleagueList = new ArrayList<>();
    }

    public ConcreteMediator(List<Colleague> colleagueList) {
        this.colleagueList = new ArrayList<>();
    }


    @Override
    public void addColleague(Colleague colleague) {
        this.colleagueList.add(colleague);
    }

    @Override
    public void mediate(Colleague colleague) {
        for (Colleague receiverColleague : colleagueList) {
            System.out.println();System.out.printf("\t[Mediating " + colleague.getName() + " to " + receiverColleague.getName() + "] ");
            receiverColleague.receive(colleague);
        }
    }
}

enum ColleagueType{
    USER, SYSTEM, ADMIN
}

abstract class Colleague {
    private Mediator mediator;
    private String message;
    private final String name;
    private final ColleagueType type;

    public Colleague(String name, ColleagueType type) {
        this.name = name;
        this.type = type;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public ColleagueType getType() {
        return type;
    }

    public void send(){
        System.out.println(this.name + " send()");
        System.out.println();
        mediator.mediate(this);
    }

    public abstract void receive(Colleague colleague);
}

class UserConcreteColleague extends Colleague {


    public UserConcreteColleague(String name) {
        super(name, ColleagueType.USER);
    }

    @Override
    public void receive(Colleague colleague) {
        if (ColleagueType.SYSTEM == colleague.getType()) {
            System.out.println("[SYSTEM] ");
        } else if (ColleagueType.USER == colleague.getType()) {
            System.out.println("[" + colleague.getName() + "]");
        }
        System.out.println(colleague.getMessage());
    }
}

class SystemConcreteColleague extends Colleague {

    public SystemConcreteColleague(String name) {
        super(name, ColleagueType.SYSTEM);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("System can't receive messages");
    }
}

class AdminConcreteColleague extends Colleague {

    public AdminConcreteColleague(String name) {
        super(name, ColleagueType.ADMIN);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("Admin can't receive messages");
    }
}

