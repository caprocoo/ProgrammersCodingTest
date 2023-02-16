package theory.java.modern.chap04;

import theory.java.modern.example.Dish;

import java.util.List;
import java.util.stream.Collectors;

import static theory.java.modern.example.Dish.menu;

/**
 * packageName    : theory.java.modern.chap04
 * fileName       : Chap04Main
 * author         : caprocoo
 * date           : 2023-01-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-12        caprocoo       최초 생성
 */
public class StreamBasicExample {
    public static void main(String[] args) {
        List<String> threeHighCaloricDishNames =
                menu.stream()
                        .filter(dish -> dish.getCalories() > 300)   // 파이프라인 연산 만들기, 첫 번째로 고칼로리 요리를 필터링한다.       
                        .map(Dish::getName)                         // 요리명 추출
                        .limit(3)                                   // 선착순 세 개만 선택
                        .collect(Collectors.toList());              // 결과를 다른 리스트로 저장


        System.out.println(threeHighCaloricDishNames);
    }
}
