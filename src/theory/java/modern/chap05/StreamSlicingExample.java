package theory.java.modern.chap05;

import theory.java.modern.example.Dish;

import java.util.Arrays;
import java.util.List;

/**
 * packageName    : theory.java.modern.chap05
 * fileName       : StreamSlicing
 * author         : caprocoo
 * date           : 2023-01-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-13        caprocoo       최초 생성
 */
public class StreamSlicingExample {
    public static void main(String[] args) {

        List<Dish> specialMenu = Arrays.asList(
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 530, Dish.Type.MEAT),
                new Dish("french fries", true, 400, Dish.Type.OTHER));

        // 1. takeWhile 사용
//        specialMenu.stream().takeWhile(dish->dish.getCalories()<400).map(Dish::getCalories).forEach(System.out::println);

        // 2. dropWhile 사용
        specialMenu.stream().dropWhile(dish->dish.getCalories()<530).map(Dish::getCalories).forEach(System.out::println);



    }

}
