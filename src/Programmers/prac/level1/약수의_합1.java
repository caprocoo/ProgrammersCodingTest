package Programmers.prac.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 약수의_합1 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                answer+=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        약수의_합1 a = new 약수의_합1();

        int n = 12;
        a.solution(n);
    }
}
