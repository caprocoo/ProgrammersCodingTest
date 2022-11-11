package programmers.prac.level1;

import java.util.Arrays;

public class 음양더하기1 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i]){
                answer+=absolutes[i];
            }else{
                answer-=absolutes[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        음양더하기1 abc = new 음양더하기1();
//        int [] arr = {4,7,12};
//        boolean[] signs = {true, false, true};

        int [] arr = {1,2,3};
        boolean[] signs = {false, false, true};
        abc.solution(arr, signs);
    }
}
