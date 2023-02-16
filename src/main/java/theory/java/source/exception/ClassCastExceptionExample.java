package theory.java.source.exception;

public class ClassCastExceptionExample {
    static class Animal {}
    static class Dog extends Animal{}
    static class Cat extends Animal{}


    public static void main(String[] args) {
        // Dog 객체 생성
        Dog dog = new Dog();
        changeDog(dog);

        // Cat 객체 생성
        Cat cat = new Cat();
        changeDog(cat);
    }
    public static void changeDog(Animal animal) {
        Dog dog = (Dog) animal; // ClassCastException 발생 가능
    }
}
