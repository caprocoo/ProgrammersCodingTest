package theory.java.modern.chap04;

import theory.java.modern.example.Dish;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static theory.java.modern.example.Dish.menu;

/**
 * packageName    : theory.java.modern.chap04
 * fileName       : InnerOuterIterator
 * author         : caprocoo
 * date           : 2023-01-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-13        caprocoo       최초 생성
 */
public class InnerOuterIterator {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        // 1. 컬렉션 for-each 루프를 이용하는 외부 반복
        for (Dish dish : menu
        ) {
            names.add(dish.getName());
        }


        // 2. 컬렉션 : 내부적으로 숨겨졌던 반복자를 사용한 외부 반복
        Iterator<Dish> iterator = menu.iterator();
        while (iterator.hasNext()) {
            Dish dish = iterator.next();
            names.add(dish.getName());
        }

        // 3. 스트림 : 내부 반복
        List<String> streamNames = menu.stream().map(Dish::getName).collect(Collectors.toList());

    }
}
