package programmers.prac.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 제일_작은_수_제거하기1 {

    public int[] solution(int[] arr) {


        int min = Arrays.stream(arr).min().getAsInt();
        int index = IntStream.range(0, arr.length)
                .filter(i -> min == arr[i]).findFirst().orElse(-1);
        
        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        list.remove(index);
        if(list.isEmpty()){
            list.add(-1);
        }
        return list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {

        제일_작은_수_제거하기1 abc = new 제일_작은_수_제거하기1();
//        int [] arr = {5,9,7,10,4,3};
        int [] arr = {10};
        abc.solution(arr);
    }
}
