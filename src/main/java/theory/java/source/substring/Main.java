package theory.java.source.substring;

/**
 * packageName    : theory.java.source.substring
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-02-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-17        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        // 1. String substring (int index)
        String str = "자바란 무엇인가??";
        System.out.println(str.substring(5));   // return 엇인가??

        // 2. String substring (int beginIndex, int endIndex)
        System.out.println(str.substring(4, 7));    // return 무엇인

    }




}
