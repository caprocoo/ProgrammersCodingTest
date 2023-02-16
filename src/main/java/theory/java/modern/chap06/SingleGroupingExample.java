package theory.java.modern.chap06;
import theory.java.modern.example.Dish;

import java.util.*;
import java.util.stream.Collectors;

import static theory.java.modern.example.Dish.*;
/**
 * packageName    : theory.java.modern.chap06
 * fileName       : Chap06Practice
 * author         : caprocoo
 * date           : 2023-01-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-16        caprocoo       최초 생성
 */

public class SingleGroupingExample {
    public static void main(String[] args) {

        // 0. filter, collect 연산
        Map<Dish.Type, List<Dish>> collect = menu.stream().filter(dish -> dish.getCalories() > 500).collect(Collectors.groupingBy(Dish::getType));
        System.out.println(collect);

        // 1. filtering
        Map<Dish.Type, List<Dish>> collect1 = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.filtering(dish -> dish.getCalories() > 500, Collectors.toList())));
        System.out.println(collect1);

        // 2. mapping / default groupingBy
        Map<Dish.Type, List<String>> collect2 = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.mapping(Dish::getName, Collectors.toList())));
        Map<Dish.Type, List<Dish>> collect3 = menu.stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println(collect2);
        System.out.println(collect3);

        // 3. flatMapping
        Map<Type, Set<String>> collect4 = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.flatMapping(dish -> dishTags.get(dish.getName()).stream(), Collectors.toSet())));
        System.out.println(collect4);


    }
}
