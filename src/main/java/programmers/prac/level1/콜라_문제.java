package programmers.prac.level1;

/**
 * packageName    : programmers.prac.level1
 * fileName       : 콜라_문제
 * author         : caprocoo
 * date           : 2023-04-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-30        caprocoo       최초 생성
 */
public class 콜라_문제 {
    public static void main(String[] args) {
        콜라_문제 ab = new 콜라_문제();
        int a = 2;
        int b = 1;
        int n = 20;
        ab.solution(a, b, n);
    }

    public int solution(int a, int b, int n) {
        int answer = 0;

        while (true) {
            if (n < a) {
                break;
            }
            answer += (n / a) * b;
            int remain = n % a;

            n = (n / a) * b + remain;
        }
        return answer;
    }

}
