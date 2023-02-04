package theory.java.source.gof.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Component espresso = new BaseComponent();
        System.out.println("에스프레소 : "+espresso.add());

        Component americano = new WaterDecorator(new BaseComponent());
        System.out.println("아메리카노 : "+americano.add());

        Component latte = new MilkDecorator(new WaterDecorator(new BaseComponent()));
        System.out.println("라떼 : " + latte.add());
    }
}
interface Component{
    String add();
}

class BaseComponent implements Component {

    @Override
    public String add() {
        return "에스프레소";
    }
}

abstract class Decorator implements Component {
    private Component coffeeComponent;

    public Decorator(Component coffeeComponent) {
        this.coffeeComponent = coffeeComponent;
    }
    public String add(){
        return coffeeComponent.add();
    }
}

class WaterDecorator extends Decorator {

    public WaterDecorator(Component coffeeComponent) {
        super(coffeeComponent);
    }
    @Override
    public String add(){
        return super.add() + "+ 물";
    }
}

class MilkDecorator extends Decorator {

    public MilkDecorator(Component coffeeComponent) {
        super(coffeeComponent);
    }
    @Override
    public String add(){
        return super.add() + "+ 우유";
    }

}
