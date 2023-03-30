package theory.java.source;

/**
 * packageName    : theory.java.source
 * fileName       : Ex2
 * author         : caprocoo
 * date           : 2023-03-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-29        caprocoo       최초 생성
 */
public class Ex2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] evenArr = Arrays.stream(arr)
                .filter(n -> n % 2 == 0) // 짝수인 요소만 선택
                .toArray();

        System.out.println(Arrays.toString(evenArr)); // [2, 4, 6, 8, 10]int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] evenArr = Arrays.stream(arr)
                .filter(n -> n % 2 == 0) // 짝수인 요소만 선택
                .toArray();

        System.out.println(Arrays.toString(evenArr)); // [2, 4, 6, 8, 10]


    }
}
