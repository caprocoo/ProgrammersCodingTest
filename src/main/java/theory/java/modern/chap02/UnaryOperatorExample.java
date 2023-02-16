package theory.java.modern.chap02;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * packageName    : theory.java.modern.chap02
 * fileName       : UnaryOperator
 * author         : caprocoo
 * date           : 2023-01-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-12        caprocoo       최초 생성
 */
public class UnaryOperatorExample {
    public static void main(String[] args) {

        UnaryOperatorExample a = new UnaryOperatorExample();
        // Function
        // andThenValue : (10 + 2) * 2 = 24
        // composeValue :  (2 * 2) + 10 = 14
        a.exampleFunction(2);

        // UnaryOperator
        // andThenValue : (10 + 2) * 2 = 24
        // composeValue :  (2 * 2) + 10 = 14
        a.exampleUnaryOperator(2);

    }
    public void exampleFunction (Integer number){
        Function<Integer, Integer> plusTen = i -> i+10;
        Function<Integer, Integer> multiplyTwo = i -> i*2;

        Integer andTenValue = plusTen.andThen(multiplyTwo).apply(number);
        Integer composeValue = plusTen.compose(multiplyTwo).apply(number);

        System.out.println("andTenValue = " + andTenValue);
        System.out.println("composeValue = " + composeValue);

    }
    public void exampleUnaryOperator(Integer number){
        UnaryOperator<Integer> plusTen = i -> i + 10;
        UnaryOperator<Integer> multiplyTwo = i -> i * 2;

        Integer andTenValue = plusTen.andThen(multiplyTwo).apply(number);
        Integer composeValue = plusTen.compose(multiplyTwo).apply(number);

        System.out.println("andTenValue = " + andTenValue);
        System.out.println("composeValue = " + composeValue);

    }
}
