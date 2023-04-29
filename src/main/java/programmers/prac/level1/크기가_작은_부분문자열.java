package programmers.prac.level1;


/**
 * packageName    : programmers.prac.level1
 * fileName       : 크기가_작은_부분문자열
 * author         : caprocoo
 * date           : 2023-04-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-29        caprocoo       최초 생성
 */
public class 크기가_작은_부분문자열 {
    public static void main(String[] args) {
        크기가_작은_부분문자열 a = new 크기가_작은_부분문자열();
        String t = "10203";
        String p = "15";
        a.solution(t, p);
    }
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i < t.length()-p.length()+1; i++) {
            long parseIntT = Long.parseLong(t.substring(i, i+ p.length()));
            if (parseIntT <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}
