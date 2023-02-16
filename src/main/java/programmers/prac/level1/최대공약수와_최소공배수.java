package programmers.prac.level1;


import java.util.Arrays;
import java.util.Scanner;

public class 최대공약수와_최소공배수 {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for (int i = 1; i <=n && i<=m; i++) {
            if(n%i==0 && m%i==0){
                answer[0] = i;
            }
        }
        answer[1] = (n*m)/answer[0];
        return answer;
    }

    public static void main(String[] args) {

        최대공약수와_최소공배수 a = new 최대공약수와_최소공배수();

        int n = 3;
        int m = 12;
        a.solution(n,m);
    }
}
