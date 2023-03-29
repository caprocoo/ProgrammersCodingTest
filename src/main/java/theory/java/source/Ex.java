package theory.java.source;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashSet;
/**
 * packageName    : theory.java.source
 * fileName       : ex
 * author         : caprocoo
 * date           : 2023-02-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-15        caprocoo       최초 생성
 */
public class Ex {
    public static void main(String[] args) {


        String[] array = {"001", "001", "002", "002", "003", "004"};

        // 중복 제거
        HashSet<String> set = new HashSet<String>(Arrays.asList(array));
        String[] uniqueArray = set.toArray(new String[set.size()]);

        // 유지하려는 값
        String[] keepValues = {"001", "002"};

        // 배열을 ArrayList로 변환
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(uniqueArray));

        // 유지하려는 값이 아닌 요소 제거
        list.removeIf(element -> !Arrays.asList(keepValues).contains(element));

        // 다시 배열로 변환
        String[] resultArray = list.toArray(new String[list.size()]);

        // 결과 출력
        System.out.println(Arrays.toString(resultArray)); // [001, 002]

    }
}
