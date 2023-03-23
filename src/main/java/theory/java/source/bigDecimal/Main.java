package theory.java.source.bigDecimal;

import java.math.BigDecimal;

/**
 * packageName    : theory.java.source.bigDecimal
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-03-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-23        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        // 1.선언
        BigDecimal bigDecimal = new BigDecimal("100000.12345");
        BigDecimal bigDecimal2 = new BigDecimal("10000");

        // 2. 계산
        System.out.println("덧셈(+) : " + bigDecimal.add(bigDecimal2));
        System.out.println("뺄셈(-) : " + bigDecimal.subtract(bigDecimal2));
        System.out.println("곱셈(*) : " + bigDecimal.multiply(bigDecimal2));
        System.out.println("나눗셈(/) : " + bigDecimal.divide(bigDecimal2));
        System.out.println("나머지(%) : " + bigDecimal.remainder(bigDecimal2));


        // 3. 형 변환
        BigDecimal bigDecimal3 = BigDecimal.valueOf(100000.12345);  // double to BigDecimal
        int int_bigNum = bigDecimal3.intValue(); //BigDecimal -> int
        long long_bigNum = bigDecimal3.longValue(); //BigDecimal -> long
        float float_bigNum = bigDecimal3.floatValue(); //BigDecimal -> float
        double double_bigNum = bigDecimal3.doubleValue(); //BigDecimal -> double
        String String_bigNum = bigDecimal3.toString(); //BigDecimal -> String

        // 4. 두 수 비교    맞으면 0 / 틀리면 -1
        BigDecimal bigDecimal4 = new BigDecimal("100000.12345");
        BigDecimal bigDecimal5 = new BigDecimal("100000.6789");
        int compare = bigDecimal4.compareTo(bigDecimal5);
        System.out.println(compare);


    }





}
