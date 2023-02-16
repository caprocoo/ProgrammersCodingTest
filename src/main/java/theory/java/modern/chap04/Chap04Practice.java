package theory.java.modern.chap04;

import theory.java.modern.example.Dish;

import java.util.List;
import java.util.stream.Collectors;

import static theory.java.modern.example.Dish.menu;

/**
 * packageName    : theory.java.modern.chap04
 * fileName       : Chap04Practice
 * author         : caprocoo
 * date           : 2023-01-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-13        caprocoo       최초 생성
 */
public class Chap04Practice {
    public static void main(String[] args) {
        List<String> StreamList = menu.stream().filter(dish -> dish.getCalories() > 300).map(Dish::getName).collect(Collectors.toList());
        System.out.println(StreamList);

    }
}
