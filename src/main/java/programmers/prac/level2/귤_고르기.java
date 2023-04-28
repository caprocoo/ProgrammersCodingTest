package programmers.prac.level2;

import java.util.*;

/**
 * packageName    : programmers.prac.level2
 * fileName       : 귤_고르기
 * author         : caprocoo
 * date           : 2023-04-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-28        caprocoo       최초 생성
 */
public class 귤_고르기 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 5, 2, 3};
        int k = 6;
        귤_고르기 a = new 귤_고르기();
        a.solution(k, arr);
    }
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : tangerine) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((o1, o2) -> map.get(o2) - map.get(o1));
        int i =0;
        while (k > 0) {
            k -= map.get(list.get(i));
            i++;
            answer++;
        }
        System.out.println(answer);

        return answer;
    }
}
