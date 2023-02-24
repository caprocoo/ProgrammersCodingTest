package theory.java.source.casting;

/**
 * packageName    : theory.java.source.casting
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-02-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-24        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        // Up-Casting
        Student student = new Student();
        Human human = student;

        // Down-Casting
        Human human1 = new Human();
        Student student1 = (Student) human1;
    }
}
class Human{

}

class Student extends Human {

}

