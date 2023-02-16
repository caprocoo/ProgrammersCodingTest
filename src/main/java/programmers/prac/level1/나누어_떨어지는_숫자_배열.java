package programmers.prac.level1;

import java.util.ArrayList;

public class 나누어_떨어지는_숫자_배열 {

    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list.stream().sorted().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {

        나누어_떨어지는_숫자_배열 abc = new 나누어_떨어지는_숫자_배열();
        int [] arr = {5,9,7,10};
        int divisor = 5;
        abc.solution(arr, divisor);
    }
}
