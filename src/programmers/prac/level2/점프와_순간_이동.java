package programmers.prac.level2;

public class 점프와_순간_이동 {
    public int solution(int n) {
        int answer = 0;
        while(n!=0){
            if(n%2==0){
                n/=2;
            }else{
                n-=1;
                answer++;
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        점프와_순간_이동 g = new 점프와_순간_이동();

        int n = 6;

        g.solution(n);
    }
}
