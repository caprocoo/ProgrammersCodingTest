package theory.java.source.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : theory.java.source.generic
 * fileName       : Generic_Wild_Card
 * author         : caprocoo
 * date           : 2022-12-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-31        caprocoo       최초 생성
 */

class Juice{

}
class Fruit {
    String name;
    @Override
    public String toString() {
        return name;
    }
}
class Apple extends Fruit {
    public Apple() {
        this.name = "사과";
    }
}
class Banana extends Fruit {
    public Banana() {
        this.name = "바나나";
    }
}
class FruitCup<T extends Fruit> {
    List<T> fruits;
    public FruitCup() {
        fruits = new ArrayList<>();
    }
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
    public List<T> getFruits() {
        return fruits;
    }
}
public class Generic_Wild_Card {
    public static void main(String[] args) {


    }
}
