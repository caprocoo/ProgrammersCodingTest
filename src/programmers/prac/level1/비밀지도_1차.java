package programmers.prac.level1;


import java.util.Arrays;

public class 비밀지도_1차 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        String [] a1 = new String[n];
        String [] a2 = new String[n];
        for (int i = 0; i < n; i++) {
            a1[i] = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i])));
            a2[i] = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr2[i])));
            String value = "";
            char[] ch = a1[i].toCharArray();
            char[] ch2 = a2[i].toCharArray();

            for (int j = 0; j < a1[i].length(); j++) {
                value += (ch[j]=='1' || ch2[j]=='1')?"#":" ";
            }
            answer[i] = value;

        }

        return answer;
    }

    public static void main(String[] args) {

        비밀지도_1차 a = new 비밀지도_1차();

        int n = 6;
//        int []arr1 ={9,20,28,18,11};
//        int []arr2 ={30,1,21,17,28};
        int []arr1 ={46, 33, 33 ,22, 31, 50};
        int []arr2 ={27 ,56, 19, 14, 14, 10};
        a.solution(n,arr1,arr2);
    }
}
