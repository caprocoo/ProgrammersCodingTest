package theory.java.modern.chap02;

import java.util.Arrays;
import java.util.function.BiFunction;

/**
 * packageName    : theory.java.modern.chap02
 * fileName       : Operator
 * author         : caprocoo
 * date           : 2023-01-12
 * description    :
 * ===========================================================J다이어트 복싱 체육관
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-12        caprocoo       최초 생성
 */
public enum Operator {
    PLUS ("+", (firstValue, secondValue) -> firstValue + secondValue),
    MINUS ("-", (firstValue, secondValue) -> firstValue - secondValue),
    MULTIPLY ("*", (firstValue, secondValue) -> firstValue * secondValue),
    DIVIDED ("/", (firstValue, secondValue) -> {
        if (secondValue == 0) {
            throw new IllegalArgumentException(String.valueOf(Exception.class));
        }
        return firstValue / secondValue;
    });

    private final String operator;
    private final BiFunction<Integer, Integer, Integer> expression;

    /*
     * BiFunction은 첫번째 인자, 두번째 인자를 받아 세번째 인자로 리턴해주는 Functional Interface 이다.
     * */
    Operator(String operator, BiFunction<Integer, Integer, Integer> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    /* operator로 Mapping되는 simbol과 firstValue, secondValue를 계산한 값을 리턴한다. */
    public static int result(String operator, int firstValue, int secondValue) {
        return findSymbols(operator).expression.apply(firstValue, secondValue);
    }

    /* filter를 통해 연산 기호를 찾는다. */
    public static Operator findSymbols(String operate) {
        return Arrays.stream(values())
                .filter(operator -> operator.operator.equals(operate))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.valueOf(Exception.class)));
    }
}
