package theory.java.modern.chap02;

/**
 * packageName    : theory.java.modern.chap02
 * fileName       : Chap02Main
 * author         : caprocoo
 * date           : 2023-01-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-12        caprocoo       최초 생성
 */
public class TriFunctionExample {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> ab = (integer, integer2, integer3) -> integer + integer2 + integer3;
        System.out.println(ab.apply(1, 2, 3));
    }
}

// 3개의 인수(T, U, V)를 받아 R의 생성자 참조를 사용하는 interface
interface TriFunction<T ,U, V, R> {
    R apply(T t, U u, V v);

}