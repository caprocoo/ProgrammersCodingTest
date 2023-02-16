package programmers.prac.level1;


import java.util.ArrayList;

public class 두_개_뽑아서_더하기 {

    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                list.add(numbers[i]+numbers[j]);
            }
        }
        return list.stream().distinct().sorted().mapToInt(i->i).toArray();

    }

    public static void main(String[] args) {

        두_개_뽑아서_더하기 a = new 두_개_뽑아서_더하기();

        int [] arr = {2,1,3,4,1};
        a.solution(arr);
    }
}
