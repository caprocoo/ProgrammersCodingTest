package theory.java.source.gof.behavioral.state;

/**
 * packageName    : theory.java.source.gof.behavioral.state
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-02-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-15        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        On on = new On();
        Off off = new Off();
        Saving saving = new Saving();

        // off
        laptop.powerPush();

        // on
        laptop.setPowerState(on);
        laptop.powerPush();

        // saving
        laptop.setPowerState(saving);
        laptop.powerPush();

        // off
        laptop.setPowerState(off);
        laptop.powerPush();

        // on
        laptop.setPowerState(on);
        laptop.powerPush();

    }
}

interface PowerState{
    public void powerPush();
}

class On implements PowerState {

    @Override
    public void powerPush() {
        System.out.println("전원 off");
    }
}
class Off implements PowerState {

    @Override
    public void powerPush() {
        System.out.println("절전모드");
    }
}

class Saving implements PowerState {

    @Override
    public void powerPush() {
        System.out.println("전원 on");
    }
}

class Laptop{
    private PowerState powerState;

    public Laptop() {
        this.powerState = new Off();
    }

    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }
    public void powerPush(){
        powerState.powerPush();
    }
}


