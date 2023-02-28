package theory.java.source.regEx;

/**
 * packageName    : theory.java.source.regEx
 * fileName       : Metacharacters
 * author         : caprocoo
 * date           : 2023-02-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-27        caprocoo       최초 생성
 */
public class Metacharacters {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();


    }
    
    // ex1, ex5 사용
    public static void matchString(String data, String data2, String av, String ac, String Ex_g, String Ex_6) {
        String pattern = data;
        System.out.println(av.matches(pattern));
        System.out.println(ac.matches(pattern));

        pattern = data2;
        System.out.println(Ex_g.matches(pattern));
        System.out.println(Ex_6.matches(pattern));
    }

    // 예제 분기 함수
    public static void markPoint(String point){
        System.out.println("---------------" + point + "---------------");

    }
    // . 는 문자 1개에 해당한다. 그 문자가 숫자인지 whitespace인지는 중요하지 않다.
    private static void ex1() {
        markPoint("ex1");
        matchString("ab.", "ab\\s\\S", "ab", "abc", "ab  ", "ab c");
    }
    
    // ex2, ex3, ex4 사용
    public static void replaceString(String x, String word1, String word2) {
        String result;
        result = x.replaceAll(word1, "*");
        System.out.println(result);

        result = x.replaceAll(word2, "*");
        System.out.println(result);
    }

    // ^ 는 문자열의 시작지점을 찾는다.
    private static void ex2() {
        markPoint("ex2");
        replaceString("The cat sat on the mat.", "[Tt]he", "^[Tt]he");
    }

    // $ 는 문장려의 종료지점을 찾는다.
    private static void ex3() {
        markPoint("ex3");
        replaceString("The cat sat on the mat. and the cat", "cat", "cat$");
    }

    // \b 는 단어의 경계선을 찾는 역할을 한다.
    private static void ex4() {
        markPoint("ex4");
        replaceString("This island is beautiful.", "is", "\\bis\\b");
    }

    // [ ] 는 내부의 문자열과 일치하는 문자 1개를 찾는다. '-' 를 사용하여 범위를 지정할 수 있다.
    private static void ex5() {
        markPoint("ex5");
        matchString("[abc][vz]","Ex_[a-g1-5]", "av", "ac", "Ex_g", "Ex_6");
    }

}
