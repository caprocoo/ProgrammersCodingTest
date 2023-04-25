package programmers.prac.level1;

/**
 * packageName    : programmers.prac.level1
 * fileName       : 실패율
 * author         : caprocoo
 * date           : 2023-04-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-25        caprocoo       최초 생성
 */
public class 멀리_뛰기 {
    public static void main(String[] args) {
        멀리_뛰기 a = new 멀리_뛰기();
        a.solution(4);

    }

    public long solution(int n) {
        int[] dp = new int[2001];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<2001; i++){
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        return dp[n];
    }

}
