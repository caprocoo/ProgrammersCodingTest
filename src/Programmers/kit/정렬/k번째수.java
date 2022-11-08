package Programmers.kit.정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class k번째수 {

    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();

        for(int[] a : commands) {
            int[] arr = Arrays.copyOfRange(array, a[0]-1, a[1]);
            Arrays.sort(arr);
            int value = arr[a[2]-1];
            list.add(value);
        }

        return list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {

        k번째수 k = new k번째수();
        int [] answer = {1,5,2,6,3,7,4};
        int [][] commands = {{2,5,3},{4,4,1},{5,6,3}};
        k.solution(answer, commands);
    }
}
