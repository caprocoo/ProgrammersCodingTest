package programmers.prac.level1;

public class 두_정수_사이의_합 {

    public long solution(int a, int b) {
        long answer = 0;
        
        long min = Math.min(a,b);
        long max = Math.max(a,b);
        for (long i = min; i < max+1; i++) {
            answer+=i;
        }

        return answer;
    }


    public static void main(String[] args) {

        두_정수_사이의_합 abc = new 두_정수_사이의_합();
        int a = 3;
        int b = 3;
        abc.solution(a,b);
    }
}
