package programmers.prac.level1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * packageName    : programmers.prac.level1
 * fileName       : 추억_점수
 * author         : caprocoo
 * date           : 2023-04-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-26        caprocoo       최초 생성
 */
public class 추억_점수 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        추억_점수 a = new 추억_점수();
        a.solution(name, yearning, photo);


    }


    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int value = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if(map.get(photo[i][j]) != null){
                    value += map.get(photo[i][j]);
                }
            }
            answer[i] = value;
        }



        return answer;
    }
}
