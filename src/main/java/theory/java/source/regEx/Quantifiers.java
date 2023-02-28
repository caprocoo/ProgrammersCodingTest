package theory.java.source.regEx;

/**
 * packageName    : theory.java.source.regEx
 * fileName       : Quantifiers
 * author         : caprocoo
 * date           : 2023-02-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-28        caprocoo       최초 생성
 */
public class Quantifiers {
    public static void main(String[] args) {
        ex6();
        ex7();

    }

    // * 은 * 앞의 요소가 0 이상 반복되는 것을 의미한다.
    // + 는 1 이상 반복되는 것을 의미한다.
    private static void ex6(){
        Metacharacters.markPoint("ex6");
        Metacharacters.matchString("a*[0-9]*", "a*[0-9]+", "aaa123", "aaa", "aaa123", "aaa");
    }

    // ? 는 요소가 0 또는 1회만 반복되는 것을 의미한다.
    // {X, Y} 는 X~Y 사이의 수만큼 반복된다는 것을 의미한다.
    private static void ex7(){
        Metacharacters.markPoint("ex7");
        Metacharacters.matchString("a*[0-9]?", "a*[0-9]{0,1}", "aaa", "aaa12", "aaa", "aaa12");
    }

}
