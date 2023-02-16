package programmers.prac.level1;

public class 자연수_뒤집어_배열로_만들기2 {
    public int[] solution(long n) {

        String a = String.valueOf(n);
        int [] answer = new int[a.length()];
        int cnt = 0;
        while(n>0){
            answer[cnt] = (int)(n%10);
            n/=10;
            cnt++;
        }

        return answer;
    }

    public static void main(String[] args) {

        자연수_뒤집어_배열로_만들기2 a = new 자연수_뒤집어_배열로_만들기2();

        long n = 12345;
        a.solution(n);
    }
}
