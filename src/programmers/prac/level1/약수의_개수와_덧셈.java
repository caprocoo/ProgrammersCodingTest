package programmers.prac.level1;


public class 약수의_개수와_덧셈 {

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int cnt = 0;
            int k =1;
            while (k < i) {
                if(i%k==0){
                    cnt++;
                }
                k++;
            }
            answer+=(cnt%2==0)?-i:i;
        }
        return answer;
    }


    public static void main(String[] args) {

        약수의_개수와_덧셈 a = new 약수의_개수와_덧셈();

        int n = 13;
        int m = 17;
        a.solution(n, m);
    }
}
