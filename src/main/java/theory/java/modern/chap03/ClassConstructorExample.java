package theory.java.modern.chap03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName    : theory.java.modern.chap03
 * fileName       : ClassConstructorExample
 * author         : caprocoo
 * date           : 2023-01-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-11        caprocoo       최초 생성
 */
public class ClassConstructorExample {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

        // 1. 람다식
        String strConcat = intList.parallelStream().collect(
                () -> new StringBuilder(),
                (x, y) -> x.append(y),
                (a, b) -> a.append(b)
                ).toString();

        // 2. 생성자 메서드 참조
        String strConcat2 = intList.parallelStream().collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append
        ).toString();

        System.out.println(strConcat);
        System.out.println(strConcat2);
    }
}


