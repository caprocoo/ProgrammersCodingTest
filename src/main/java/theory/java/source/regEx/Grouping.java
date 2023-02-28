package theory.java.source.regEx;

/**
 * packageName    : theory.java.source.regEx
 * fileName       : Grouping
 * author         : caprocoo
 * date           : 2023-02-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-28        caprocoo       최초 생성
 */
public class Grouping {
    public static void main(String[] args) {
        ex8();
    }
    private static void ex8(){
        Metacharacters.markPoint("ex8");
        String pattern = "(\\w)(\\s+)([\\w])";
        System.out.println("Hello     World".replaceAll(pattern, "-"));

        pattern = "(\\w)(\\s+)([\\w])";
        System.out.println("Hello     World".replaceAll(pattern, "$1-$3"));
    }
}
