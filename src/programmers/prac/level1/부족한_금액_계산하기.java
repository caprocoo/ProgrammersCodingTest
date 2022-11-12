package programmers.prac.level1;


public class 부족한_금액_계산하기 {

    public long solution(int price, int money, int count) {
        long answer = 0;
        for (int i = 1; i <= count; i++) {
            answer += i*price;
        }
        if(answer>money) return answer-money;
        else return 0;
    }


    public static void main(String[] args) {

        부족한_금액_계산하기 a = new 부족한_금액_계산하기();

        int n = 3;
        int m = 20;
        int l = 4;
        a.solution(n, m, l);
    }
}
