package programmers.prac.level1;

import java.util.Arrays;

public class x만큼_간격이_있는_n개의_숫자 {

    public long[] solution(int x, int n) {

        long[] answer = new long [n];
        long num = x;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num;
            num+=x;
        }
        return answer;
    }


    public static void main(String[] args) {

        x만큼_간격이_있는_n개의_숫자 a = new x만큼_간격이_있는_n개의_숫자();
        int x = -4;
        int n = 2;
       
        a.solution(x, n);
    }
}
