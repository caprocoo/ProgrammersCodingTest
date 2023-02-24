package theory.java.source.casting;

/**
 * packageName    : theory.java.source.casting
 * fileName       : UpCasting
 * author         : caprocoo
 * date           : 2023-02-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-24        caprocoo       최초 생성
 */
public class UpCasting {
    public static void main(String[] args) {
        Student2 student2 = new Student2("도리도리");
        Person person = student2;
        person.name = "하이";

    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class Student2 extends Person {
    String age;

    public Student2(String name) {
        super(name);
    }
}


