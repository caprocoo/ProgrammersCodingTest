package programmers.prac.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class 없는_숫자_더하기1 {

    public int solution(int[] numbers) {

        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(numbers).boxed().collect(Collectors.toList());
        int answer = 0;

        for (int i = 0; i < 10; i++) {
            if(!list.contains(i)){
                answer +=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        없는_숫자_더하기1 abc = new 없는_숫자_더하기1();
        int [] arr = {1,2,3,4,6,7,8,0};

        abc.solution(arr);
    }
}
