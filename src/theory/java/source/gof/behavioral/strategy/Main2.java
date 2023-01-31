package theory.java.source.gof.behavioral.strategy;

/**
 * packageName    : theory.java.source.gof.behavioral.strategy
 * fileName       : Main2
 * author         : caprocoo
 * date           : 2023-01-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-31        caprocoo       최초 생성
 */
public class Main2 {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        String americano = coffeeMachine.brew(CoffeeChoice.americanoButton());
        String latte = coffeeMachine.brew(CoffeeChoice.latteButton());
        System.out.println(americano);
        System.out.println(latte);
    }
}

interface CoffeeStrategy{
    String brew();
}

class AmericanoCoffee implements CoffeeStrategy {
    private final static String AMERICANO = "아메리카노";

    @Override
    public String brew() {
        return AMERICANO;
    }
}

class LatteCoffee implements CoffeeStrategy {
    private final static String LATTE = "라떼";

    @Override
    public String brew() {
        return LATTE;
    }
}

class CoffeeMachine {
    public String brew(CoffeeStrategy coffeeStrategy){
        return coffeeStrategy.brew();
    }
}
class CoffeeChoice{
    public static CoffeeStrategy americanoButton(){
        return new AmericanoCoffee();
    }
    public static CoffeeStrategy latteButton(){
        return new LatteCoffee();
    }
}