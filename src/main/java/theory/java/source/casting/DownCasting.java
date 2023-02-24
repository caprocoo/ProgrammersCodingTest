package theory.java.source.casting;

/**
 * packageName    : theory.java.source.casting
 * fileName       : DownCasting
 * author         : caprocoo
 * date           : 2023-02-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-24        caprocoo       최초 생성
 */
public class DownCasting {
    public static void main(String[] args) {
        Person2 person2 = new Student3("헬로우");
        Student3 student3 = (Student3) person2;

        student3.name = "하이루";
        student3.age = "29";
    }
}
class Person2{
    String name;

    public Person2(String name) {
        this.name = name;
    }
}

class Student3 extends Person2 {
    String age;
    public Student3(String name) {
        super(name);
    }
}


