package programmers.prac.level2;

class 숫자의_표현1 {
    public int solution(int n) {

        int answer = 0;
        int sum;
        for (int i = 1; i <= n; i++) {
            sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if(sum == n){
                    answer++;
                    break;
                }else if(sum>n){
                    break;
                }
            }
        }

//        System.out.println("answer = " + answer);


        return answer;
    }
    public static void main(String[] args) {

        숫자의_표현1 solution = new 숫자의_표현1();

        int n = 15;

        solution.solution(n);


    }
}