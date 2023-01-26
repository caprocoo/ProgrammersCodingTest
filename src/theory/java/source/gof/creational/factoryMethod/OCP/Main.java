package theory.java.source.gof.creational.factoryMethod.OCP;

/**
 * packageName    : theory.java.source.gof.creational.factoryMethod.OCP
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-01-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-26        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        HelloAnimal hello = new HelloAnimal();
        Animal cat = new Cat();
        Animal dog = new Dog();
        hello.hello(cat);
        hello.hello(dog);

    }
}
abstract class Animal{
    abstract void speak();
}

// 추상클래스를 상속만 하면 메서드 강제 구현 규칙으로 규격화만 하면 확장에 제한이 없다. (opened)
class Cat extends Animal {
    @Override
    void speak(){
        System.out.println("냐옹");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("멍멍");
    }
}

// 기능 확장으로 인한 클래스가 추가되어도, 더 이상 수정할 필요가 없어진다. (closed)
class HelloAnimal{
    void hello(Animal animal){
        animal.speak();
    }
}

