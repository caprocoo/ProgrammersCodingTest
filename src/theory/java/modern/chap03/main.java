package theory.java.modern.chap03;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * packageName    : theory.java.modern.chap03
 * fileName       : main
 * author         : caprocoo
 * date           : 2023-01-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-11        caprocoo       최초 생성
 */
public class main {
    public static void main(String[] args) {

        Supplier<Integer> c1 = () -> new Integer(10);
        Integer a = c1.get();
        System.out.println(a);

        Consumer<String> s = (d) -> System.out.println(d);
        s.accept("Hello");

        Function<Integer, String> function = (i)->i+"는 내 나이입니다.";
        String functionStr = function.apply(29);
        System.out.println(functionStr);

        UnaryOperator<Integer> unaryOperator = i -> i + 10;
        Integer u = unaryOperator.apply(2);
        System.out.println(u);


    }
}
