package programmers;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//
//public class Ground {
//
//
//    public static void main(String[] args) {
//
//    }
//    public void method() {
//        int a=1;
//        int b=2;
//        int c= add(a, b);
//        int d= add(a, c);
//    }
//
//    private int add(int a, int b) {
//        return a + b;
//    }
//}

public class Ground {

    public static void main(String[] args) {
        Ground a = new Ground();
        a.solution("1 2 3 4");

    }
    public String solution(String s) {
        String[] arr = s.split(" ");
//        System.out.println(Arrays.toString(arr));

        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(intArr);

        String answer = intArr[0]+" " +intArr[intArr.length-1] ;
        System.out.println(answer);
        return answer;
    }
}

