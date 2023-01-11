package theory.java.modern.chap03;

import java.util.Arrays;
import java.util.Comparator;

/**
 * packageName    : theory.java.modern.chap03
 * fileName       : TypeClassMethod
 * author         : caprocoo
 * date           : 2023-01-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-11        caprocoo       최초 생성
 */
public class TypeClassMethodExample {
    public static void main(String[] args) {


        String[] strArr = {"a", "B", "e", "c", "D"};

        // 1. 일반적으로 Arrays.sort를 사용한 오름차순 로직
        Arrays.sort(strArr);

        // 2. Comparator를 사용한 오름차순 및 대소문자 구분 없이 정렬하는 로직
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        // 3. lambda를 사용한 오름차순 및 대소문자 구분 없이 정렬하는 로직
        Arrays.sort(strArr, (o1, o2) -> o1.compareToIgnoreCase(o2));

        // 4. 메서드 참조를 사용한 오름차순 및 대소문자 구분 없이 정렬하는 로직
        Arrays.sort(strArr, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(strArr));

    }



}




