package programmers.prac.level1;

/**
 * packageName    : programmers.prac.level1
 * fileName       : 푸드_파이트_대회2
 * author         : caprocoo
 * date           : 2023-05-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-02        caprocoo       최초 생성
 */
public class 푸드_파이트_대회2 {
    public static void main(String[] args) {
        푸드_파이트_대회2 a = new 푸드_파이트_대회2();
        int[] food = {1,7,1,2};
        a.solution(food);

    }
    public String solution(int[] food) {
        String answer = "0";
        for (int i = food.length-1; i >0 ; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
