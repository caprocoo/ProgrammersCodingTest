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
public class IncorrectMain {
    public static void main(String[] args) {
        IncorrectHelloAnimal hello = new IncorrectHelloAnimal();
        IncorrectAnimal cat = new IncorrectAnimal("Cat");
        IncorrectAnimal dog = new IncorrectAnimal("Dog");

        hello.hello(cat);
        hello.hello(dog);
    }

}

class IncorrectAnimal {
    String type;

    public IncorrectAnimal(String type) {
        this.type = type;
    }
}


class IncorrectHelloAnimal {
    // 기능을 확장하기 위해서는 클래스 내부 구성을 일일히 수정해야 하는 번거로움이 생긴다.
    void hello(IncorrectAnimal animal){
        if(animal.type.equals("Cat")){
            System.out.println("냐옹");
        }else if(animal.type.equals("Dog")){
            System.out.println("멍멍");
        } 
    }
}
