package programmers.prac.level2;

import java.util.Arrays;

public class N개의_최소공배수 {
    public int solution(int[] arr) {
        if(arr.length==1) return arr[0];

        // 최대공약수
        int gcd = getGCD(arr[0], arr[1]);
        // 최소공배수
        int lcm = (arr[0]*arr[1]) / gcd;

        for (int i = 2; i < arr.length; i++) {
            gcd = getGCD(lcm, arr[i]);
            lcm = (lcm*arr[i])/gcd;
        }

        return lcm;
    }

    public static int getGCD(int num1, int num2){

//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);

        if(num1%num2==0){
            return num2;
        }
        return getGCD(num2, num1%num2);
    }


    public static void main(String[] args) {
        N개의_최소공배수 g = new N개의_최소공배수();

        int [] arr = {2,6,8,14};
        g.solution(arr);
    }
}
