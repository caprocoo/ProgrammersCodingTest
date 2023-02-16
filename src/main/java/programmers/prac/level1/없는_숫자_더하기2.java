package programmers.prac.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class 없는_숫자_더하기2 {

    public int solution(int[] numbers) {

        int num = 45;

        for (int i : numbers) {
            num-=i;
        }
        return num;
    }

    public static void main(String[] args) {

        없는_숫자_더하기2 abc = new 없는_숫자_더하기2();
        int [] arr = {1,2,3,4,6,7,8,0};

        abc.solution(arr);
    }
}
