
package theory.java.modern.chap06;

import theory.java.modern.example.Dish;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static theory.java.modern.example.Dish.*;



/**
 * packageName    : theory.java.modern.chap06
 * fileName       : Chap06Practice
 * author         : caprocoo
 * date           : 2023-01-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-17        caprocoo       최초 생성
 */
public class Chap06Practice {
    public static void main(String[] args) {

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int strLength = str.length();
        StringBuffer randomStr = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomStr.append(str.charAt(random.nextInt(strLength)));
        }




    }
    public boolean isPrime(int candidate){
        int candidateRoot = (int)Math.sqrt(candidate);
        return IntStream.rangeClosed(2, candidateRoot)
                .noneMatch(i -> candidate % i == 0);
    }
}
