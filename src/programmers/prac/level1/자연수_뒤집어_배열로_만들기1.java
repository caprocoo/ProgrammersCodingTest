package programmers.prac.level1;

public class 자연수_뒤집어_배열로_만들기1 {
    public int[] solution(long n) {

        StringBuilder bd = new StringBuilder(String.valueOf(n));
        String a = String.valueOf(bd.reverse());
        String [] arr = a.split("");
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {

        자연수_뒤집어_배열로_만들기1 a = new 자연수_뒤집어_배열로_만들기1();

        long n = 12345;
        a.solution(n);
    }
}
