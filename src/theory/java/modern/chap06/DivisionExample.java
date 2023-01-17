package theory.java.modern.chap06;
import theory.java.modern.example.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static theory.java.modern.example.Dish.*;

/**
 * packageName    : theory.java.modern.chap06
 * fileName       : DivisionExample
 * author         : caprocoo
 * date           : 2023-01-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-17        caprocoo       최초 생성
 */
public class DivisionExample {
    public static void main(String[] args) {

        // * 분할 시작
        // 1. 채식 요리와 채식이 아닌 요리로 분류한다.
        Map<Boolean, List<Dish>> collect = menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(collect);

        // 2. true 값을 통한 채식 요리 리턴
        List<Dish> vegetarianDishes = collect.get(true);
        System.out.println(vegetarianDishes);

        // 3. 리스트로 표현할 수도 있다. - 모든 채식 요리를 얻을 수 있다.
        List<Dish> collect1 = menu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
        System.out.println(collect1);

        // 1) 분할의 장점
        // 1. partitioningBy 두 번째 인자 사용
        Map<Boolean, Map<Type, List<Dish>>> vegetarianDishesByType = menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors.groupingBy(Dish::getType)));
        System.out.println(vegetarianDishesByType);

        // 2. 채식 요리와 채식이 아닌 요리 각각의 그룹에서 가장 칼로리가 높은 요리를 찾는다.
        Map<Boolean, Dish> mostCaloricPartitionedByVegetarian = menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)),
                Optional::get
        )));
        System.out.println(mostCaloricPartitionedByVegetarian);
        System.out.println();


        System.out.println(isPrime(3));
        System.out.println(partitionPrimes(3));

    }
    // 2) 숫자를 소수와 비소수로 분할하기
    public static boolean isPrime(int candidate){
        int candidateRoot = (int) Math.sqrt(candidate);
        return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> candidate % i == 0);
    }

    public static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n).boxed().collect(
                Collectors.partitioningBy(candidate -> isPrime(candidate))
        );
    }
}
