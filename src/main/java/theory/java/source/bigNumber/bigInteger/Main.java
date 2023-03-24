package theory.java.source.bigNumber.bigInteger;

import java.math.BigInteger;

/**
 * packageName    : theory.java.source.bigNumber.bigInteger
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-03-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-24        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        // 1. 선언
        BigInteger bigInteger = new BigInteger("10000");

        // 2. 계산
        BigInteger bigInteger1 = new BigInteger("100000");
        BigInteger bigInteger2 = new BigInteger("10000");

        System.out.println("덧셈(+) :" +bigInteger1.add(bigInteger2));
        System.out.println("뺄셈(-) :" +bigInteger1.subtract(bigInteger2));
        System.out.println("곱셈(*) :" +bigInteger1.multiply(bigInteger2));
        System.out.println("나눗셈(/) :" +bigInteger1.divide(bigInteger2));
        System.out.println("나머지(%) :" +bigInteger1.remainder(bigInteger2));

        // 3. 형 변환
        BigInteger bigInteger3 = BigInteger.valueOf(100000); //int -> BigIntger

        int int_bigNum = bigInteger3.intValue(); //BigIntger -> int
        long long_bigNum = bigInteger3.longValue(); //BigIntger -> long
        float float_bigNum = bigInteger3.floatValue(); //BigIntger -> float
        double double_bigNum = bigInteger3.doubleValue(); //BigIntger -> double
        String String_bigNum = bigInteger3.toString(); //BigIntger -> String

        // 4. 두 수 비교
        BigInteger bigInteger4 = new BigInteger("100000");
        BigInteger bigInteger5 = new BigInteger("1000000");

        //두 수 비교 compareTo 맞으면 0   틀리면 -1
        int compare = bigInteger4.compareTo(bigInteger5);
        System.out.println(compare);
    }
}
