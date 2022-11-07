package Programmers.kit.hash;

import java.util.Arrays;
import static java.util.stream.Collectors.*;

public class 위장2 {
    public int solution(String[][] clothes) {
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }

    public static void main(String[] args) {

        위장2 a = new 위장2();

//        String[][] arr = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};

        String [][] arr = {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}};

//        System.out.println(p.solution(arr));




    }
}
