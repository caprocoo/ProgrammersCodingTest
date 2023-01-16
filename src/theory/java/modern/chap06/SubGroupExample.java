package theory.java.modern.chap06;

import theory.java.modern.example.Dish;

import java.util.*;
import java.util.stream.Collectors;

import static theory.java.modern.example.Dish.menu;

/**
 * packageName    : theory.java.modern.chap06
 * fileName       : SubGroupExample
 * author         : caprocoo
 * date           : 2023-01-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-16        caprocoo       최초 생성
 */
public class SubGroupExample {
    public static void main(String[] args) {

        // 0. 요리의 수를 종류별로 계산
        Map<Dish.Type, Long> map = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
        System.out.println(map);

        // 1. 요리의 종류를 분류, 가장 높은 칼로리 요리 찾기
        Map<Dish.Type, Optional<Dish>> collect1 = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.maxBy(Comparator.comparing(Dish::getCalories))));
        System.out.println(collect1);

        // 2. Optional 삭제
        Map<Dish.Type, Dish> deleteOptional = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.collectingAndThen(
                Collectors.maxBy(
                        Comparator.comparing(Dish::getCalories)
                ), Optional::get)));

        System.out.println(deleteOptional);

        // 3. 모든 요리의 칼로리 합계를 구하는 컬렉터
        Map<Dish.Type, Integer> totalCaloriesCount = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.summingInt(Dish::getCalories)));
        System.out.println(totalCaloriesCount);

        // 4. 각 요리 형식에 존재하는 모든 CaloricLevel값을 추출
        Map<Dish.Type, Set<CaloricLevel>> caloricLevelsByType = menu.stream().collect(
                Collectors.groupingBy(Dish::getType, Collectors.mapping(dish -> {
                    if (dish.getCalories() <= 400) return CaloricLevel.Diet;
                    else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                    else return CaloricLevel.FAT;
                }, Collectors.toSet()))
        );
        System.out.println(caloricLevelsByType);

        // 5. HashSet::new -> toCollection
        Map<Dish.Type, Set<CaloricLevel>> caloricLevelsByType2 = menu.stream().collect(
                Collectors.groupingBy(Dish::getType, Collectors.mapping(dish -> {
                    if (dish.getCalories() <= 400) return CaloricLevel.Diet;
                    else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                    else return CaloricLevel.FAT;
                }, Collectors.toCollection(HashSet::new)))
        );
        System.out.println(caloricLevelsByType2);



    }
}
