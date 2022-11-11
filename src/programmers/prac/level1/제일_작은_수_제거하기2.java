package programmers.prac.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 제일_작은_수_제거하기2 {

    public int[] solution(int[] arr) {

        if(arr.length<=1) return new int[]{-1};
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i->i!=min).toArray();
    }

    public static void main(String[] args) {

        제일_작은_수_제거하기2 abc = new 제일_작은_수_제거하기2();
//        int [] arr = {5,9,7,10,4,3};
        int [] arr = {10};
        abc.solution(arr);
    }
}
