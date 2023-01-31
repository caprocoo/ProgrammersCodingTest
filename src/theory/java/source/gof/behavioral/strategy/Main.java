package theory.java.source.gof.behavioral.strategy;

/**
 * packageName    : theory.java.source.gof.behavioral.strategy
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-01-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-31        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car(new UpBehavior());
        car.move();
        car.setCarMoveBehavior(new DownBehavior());
        car.move();
        car.setCarMoveBehavior(new LeftBehavior());
        car.move();
        car.setCarMoveBehavior(new RightBehavior());
        car.move();
    }
}
interface CarMoveBehavior{
    void action();
}

class UpBehavior implements CarMoveBehavior{
    @Override
    public void action() {
        System.out.println("Up");
    }
}

class DownBehavior implements CarMoveBehavior{
    @Override
    public void action() {
        System.out.println("Down");
    }
}

class LeftBehavior implements CarMoveBehavior{
    @Override
    public void action() {
        System.out.println("Left");
    }
}

class RightBehavior implements CarMoveBehavior{
    @Override
    public void action() {
        System.out.println("Right");
    }
}

class Car{
    private CarMoveBehavior carMoveBehavior;

    public Car(CarMoveBehavior carMoveBehavior) {
        this.carMoveBehavior = carMoveBehavior;
    }

    public void move(){
        carMoveBehavior.action();
    }
    public void setCarMoveBehavior(CarMoveBehavior carMoveBehavior) {
        this.carMoveBehavior = carMoveBehavior;
    }
}

