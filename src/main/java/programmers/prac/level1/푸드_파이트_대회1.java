package programmers.prac.level1;

/**
 * packageName    : programmers.prac.level1
 * fileName       : 푸드_파이트_대회
 * author         : caprocoo
 * date           : 2023-05-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-01        caprocoo       최초 생성
 */
public class 푸드_파이트_대회1 {
    public static void main(String[] args) {
        푸드_파이트_대회1 a = new 푸드_파이트_대회1();
        int[] food = {1,7,1,2};
        a.solution(food);

    }
    public String solution(int[] food) {
        String answer = "";
        for (int i = 1; i <food.length ; i++) {
            int value = food[i] / 2;
            if (value > 0) {
                for (int j = 0; j < value; j++) {
                    answer += i;
                }
            }
        }
        answer += 0;
        for (int i = food.length-1; i > 0 ; i--) {
            int value = food[i] / 2;
            if (value > 0) {
                for (int j = value; j > 0; j--) {
                    answer += i;
                }
            }
        }
        return answer;
    }
}
