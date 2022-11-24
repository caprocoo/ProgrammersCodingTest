package theory.java.source._abstract_class;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() { //메서드 오버라이딩
        System.out.println("야옹~~");
    };
}
