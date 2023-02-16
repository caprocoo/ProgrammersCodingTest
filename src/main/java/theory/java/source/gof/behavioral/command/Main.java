package theory.java.source.gof.behavioral.command;

/**
 * packageName    : theory.java.source.gof.behavioral.command
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-02-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-08        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Alarm alarm = new Alarm();
        Command alarmStartCommand = new AlarmStartCommand(alarm);

        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        Button button2 = new Button(alarmStartCommand);
        button2.pressed();
        button2.setCommand(lampOnCommand);
        button2.pressed();

    }
}

interface Command{
    public abstract void execute();
}

class Button {
    private Command command;

    public Button(Command command) {
        setCommand(command);
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressed(){
        command.execute();
    }
}

class Lamp{
    public void turnOn(){
        System.out.println("Lamp On");
    }
}

class LampOnCommand implements Command {

    private Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }
}

class Alarm{
    public void start(){
        System.out.println("Alarming");
    }

}

class AlarmStartCommand implements Command {

    private Alarm alarm;

    public AlarmStartCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.start();
    }
}


