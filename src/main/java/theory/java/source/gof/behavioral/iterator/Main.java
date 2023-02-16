package theory.java.source.gof.behavioral.iterator;

import java.util.Iterator;

/**
 * packageName    : theory.java.source.gof.behavioral.iterator
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
        Team team = new Team("TF Team",5);
        team.addTeamMember(new Worker("Oh", WorkerType.MANAGER));
        team.addTeamMember(new Worker("Kim", WorkerType.DEVELOPER));
        team.addTeamMember(new Worker("Lee", WorkerType.DEVELOPER));
        team.addTeamMember(new Worker("Park", WorkerType.PLANNER));
        team.addTeamMember(new Worker("Hong", WorkerType.QA));

        System.out.println("Team name : " + team.getName());

        Iterator<Worker> iterator = team.iterator();
        while (iterator.hasNext()) {
            Worker worker = iterator.next();
            System.out.println("----------------------");
            System.out.println("Name : " + worker.getName());
            System.out.println("Job : " + worker.getType().getValue());

        }

    }
}

enum WorkerType{
    DEVELOPER("DEVELOPER", "개발자"),
    MANAGER("MANAGER", "매니저"),
    QA("QA", "QA"),
    PLANNER("PLANNER", "기획자");
    private final String code;
    private final String value;

    WorkerType(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}

class Worker{
    private final String name;
    private final WorkerType type;

    public Worker(String name, WorkerType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public WorkerType getType() {
        return type;
    }
}

interface Aggregate<T>{
    Iterator<T> iterator();
}

class Team implements Aggregate<Worker> {
    private final Worker[] workers;
    private final String name;
    private int lastIndex = 0;

    public Team(String name, int size) {
        this.name = name;
        workers = new Worker[size];
    }

    public void addTeamMember(Worker worker) {
        if (lastIndex < workers.length) {
            this.workers[lastIndex] = worker;
            lastIndex++;
        } else {
            System.out.println("팀의 정원이 꽉 찼습니다.");
        }
    }

    public Worker getWorkers(int index) {
        return workers[index];
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return workers.length;
    }

    @Override
    public Iterator<Worker> iterator() {
        return new TeamIterator(this);
    }
}

class TeamIterator implements Iterator<Worker> {

    private final Team team;
    private int index;

    public TeamIterator(Team team) {
        this.team = team;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < team.getSize();
    }

    @Override
    public Worker next() {
        Worker worker = team.getWorkers(index);
        index++;
        return worker;
    }

}




