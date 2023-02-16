package theory.java.modern.chap05;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * packageName    : theory.java.modern.chap05
 * fileName       : ReducingExample
 * author         : caprocoo
 * date           : 2023-01-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-13        caprocoo       최초 생성
 */
public class ReducingExample {
    public static void main(String[] args) {

        // 1. for-each를 활용한 요소의 합
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }

        // nubmers라는 리스트에서 하나의 숫자가 남을 때까지 reduce 과정을 반복한다.
        // 코드에는 파라미터를 두 개 사용했는데 1) sum 변수의 초깃값 0, 2) 리스트의 모든 요소를 조합하는 연산(+)

        // 2. Stream - reduce를 활용한 요소의 합 (초기값 있는 경우)
        // a는 누적값이 되고 b는 다음 요소가 들어온다.
        int sum2 = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum2);
        // 코드에는 파라미터를 두 개 사용했는데
        // 1) 초깃값 0, 2)
        // 2) 람다 표현식인 (a, b) -> a + b

        // 3. Stream - reduce를 활용한 요소의 합 (Integer class에서 제공하는 sum)
        int sum3 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum3);

        // 4. Stream - reduce를 활용한 요소의 합 (초기값 없는 경우)
        // 초깃 값을 받지 않도록 오버로드된 reduce인데 이 reduce는 Optional 객체를 반환한다.
        Optional<Integer> sum4 = numbers.stream().reduce((a, b) -> a + b);
        Optional<Integer> sum5 = numbers.stream().reduce(Integer::sum);
        System.out.println(sum4.get());
        System.out.println(sum5.get());




    }
}
