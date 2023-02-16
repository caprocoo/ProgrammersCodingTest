package programmers.prac.level1;


public class 이상한_문자_만들기 {

    public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }

    public static void main(String[] args) {

        이상한_문자_만들기 a = new 이상한_문자_만들기();

        String s = "try hello world";
        a.solution(s);
    }
}
