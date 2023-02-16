package programmers.prac.level2;

class 다음_큰_숫자1 {
    public int solution(int n) {

        int answer = 0;
        int nCnt = Integer.bitCount(n);
        int aCnt = 0;

        while(true){
            n++;
            aCnt = Integer.bitCount(n);
            if(aCnt==nCnt){
                answer = n;
                break;
            }
        }



        return answer;
    }
    public static void main(String[] args) {

        다음_큰_숫자1 solution = new 다음_큰_숫자1();

        int n = 78;

        solution.solution(n);


    }
}