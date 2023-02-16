package programmers.prac.level1;

public class 두_정수_사이의_합2 {

    public long solution(int a, int b) {
        long answer = 0;

        for (int i = (a<b?a:b); i <= (a>b?a:b); i++) {
            answer+=i;
        }

        return answer;
    }


    public static void main(String[] args) {

        두_정수_사이의_합2 abc = new 두_정수_사이의_합2();
        int a = 3;
        int b = 3;
        abc.solution(a,b);
    }
}
