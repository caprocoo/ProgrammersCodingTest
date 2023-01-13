package theory.java.modern.chap05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName    : theory.java.modern.chap05
 * fileName       : FlatMapExample
 * author         : caprocoo
 * date           : 2023-01-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-13        caprocoo       최초 생성
 */
public class FlatMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World");
        // 원하는 결과 값 : ["H","e","l","o","W","r","d"]

        List<String[]> splitList = words.stream().map(word -> word.split("")).distinct().collect(Collectors.toList());
        // 위와 같은 결과는 [["H","e","l","l","o"], ["W","o","r","l","d"]]로 나오게 되어 우리가 원하는 결과와 다르다.

        // 이와 같은 상황에 flatMap을 사용한다.
        List<String> uniqueCharacters = words.stream().map(word -> word.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(uniqueCharacters);

        // 여기서 Arrays::stream은 배열을 스트림으로 변환해주는 메서드 참조 표현이다.




    }
}
