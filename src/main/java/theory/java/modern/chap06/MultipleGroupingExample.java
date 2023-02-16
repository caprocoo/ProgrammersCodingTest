
package theory.java.modern.chap06;

import theory.java.modern.example.Dish;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static theory.java.modern.example.Dish.Type;
import static theory.java.modern.example.Dish.menu;
/**
 * packageName    : theory.java.modern.chap06
 * fileName       : MultipleGroupingExample
 * author         : caprocoo
 * date           : 2023-01-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-16        caprocoo       최초 생성
 */
public class MultipleGroupingExample {
    public static void main(String[] args) {

        // 1. 다수준 그룹화
        Map<Type, Map<CaloricLevel, List<Dish>>> collect = menu.stream().collect(
                Collectors.groupingBy(Dish::getType, Collectors.groupingBy(
                        dish -> {
                            if (dish.getCalories() <= 400) return CaloricLevel.Diet;
                            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        }
                ))
        );
        System.out.println(collect);

    }
}
