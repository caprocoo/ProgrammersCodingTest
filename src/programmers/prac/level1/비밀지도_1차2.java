package programmers.prac.level1;


import java.util.Arrays;

public class 비밀지도_1차2 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i]|arr2[i]);
        }
        for (int i = 0; i < n; i++) {
            result[i] = String.format("%"+n+"s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");

        }
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));


        return result;
    }

    public static void main(String[] args) {

        비밀지도_1차2 a = new 비밀지도_1차2();

        int n = 6;
//        int []arr1 ={9,20,28,18,11};
//        int []arr2 ={30,1,21,17,28};
        int []arr1 ={46, 33, 33 ,22, 31, 50};
        int []arr2 ={27 ,56, 19, 14, 14, 10};
        a.solution(n,arr1,arr2);
    }
}
