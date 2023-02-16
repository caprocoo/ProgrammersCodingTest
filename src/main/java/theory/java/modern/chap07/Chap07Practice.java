package theory.java.modern.chap07;

import java.util.stream.Stream;

/**
 * packageName    : theory.java.modern.chap07
 * fileName       : Chap07Practice
 * author         : caprocoo
 * date           : 2023-01-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-25        caprocoo       최초 생성
 */
public class Chap07Practice {
    public static void main(String[] args) {

    }
    public long sequentialSum(long n){
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .reduce(0L, Long::sum);
    }

    public long iterativeSum(long n){
        long result = 0;
        for (long i = 1L; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .parallel()
                .reduce(0L, Long::sum);
    }

}
