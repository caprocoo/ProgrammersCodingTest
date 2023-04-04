package theory.java.source.reflection;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * packageName    : theory.java.source.reflection
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-04-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-04        caprocoo       최초 생성
 */

class Member {

    private String name;

    protected int age;

    public String hobby;

    public Member() {
    }

    public Member(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void speak(String message) {
        System.out.println(message);
    }

    private void secret() {
        System.out.println("비밀번호는 1234입니다.");
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<Member> memberClass = Member.class;
        System.out.println(System.identityHashCode(memberClass));

        Member member = new Member("제이온", 23, "다라쓰 개발");
        Class<? extends Member> memberClass2 = member.getClass();
        System.out.println(System.identityHashCode(memberClass2));

        Class<?> memberClass3 = Class.forName("{패키지명}.Member");
        System.out.println(System.identityHashCode(memberClass3));
    }

}

class ConstuctorMain{
    public static void main(String[] args) throws Exception {
        // Member의 모든 생성자 출력
        Member member = new Member();
        Class<? extends Member> memberClass = member.getClass();
        Arrays.stream(memberClass.getConstructors()).forEach(System.out::println);

        // Member의 기본 생성자를 통한 인스턴스 생성
        Constructor<? extends Member> constructor = memberClass.getConstructor();
        Member member2 = constructor.newInstance();
        System.out.println("member2 = " + member2);

        // Member의 다른 생성자를 통한 인스턴스 생성
        Constructor<? extends Member> fullConstructor =
                memberClass.getConstructor(String.class, int.class, String.class);
        Member member3 = fullConstructor.newInstance("제이온", 23, "다라쓰 개발");
        System.out.println("member3 = " + member3);
    }
}
