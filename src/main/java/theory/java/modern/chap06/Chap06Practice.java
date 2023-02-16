
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





    }
    public boolean isPrime(int candidate){
        int candidateRoot = (int)Math.sqrt(candidate);
        return IntStream.rangeClosed(2, candidateRoot)
                .noneMatch(i -> candidate % i == 0);
    }
}
