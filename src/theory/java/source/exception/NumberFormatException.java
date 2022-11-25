package theory.java.source.exception;

public class NumberFormatException {
    public static void main(String[] args) {
        String corretData = "100";  // 문자열 100은 숫자로 변환 할 수 있는 값이다.
        String wrongData = "A100";  // 문자열 A100은 숫자로 변환 할 수 있는 값이다.

        int value1 = Integer.parseInt(corretData);
        int value2 = Integer.parseInt(wrongData);

        System.out.println(value1);
        System.out.println(value2);
    }
}
