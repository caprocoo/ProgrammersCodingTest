package programmers.prac.level1;

import java.util.Arrays;

public class 나머지가_1이_되는_수_찾기 {

    public int solution(int n) {

        int answer = 0;

        for (int i = 2; i <=n; i++) {
            if(n%i==1){
                answer = i;
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        나머지가_1이_되는_수_찾기 a = new 나머지가_1이_되는_수_찾기();
        int n = 12;
        a.solution(n);
    }
}
