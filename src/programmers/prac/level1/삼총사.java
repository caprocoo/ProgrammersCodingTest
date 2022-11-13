package programmers.prac.level1;



public class 삼총사 {

    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length-2; i++) {
            for (int j = i+1; j < number.length-1; j++) {
                for (int k = j+1; k < number.length; k++) {
                    if(number[i]+number[j]+number[k] == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        삼총사 a = new 삼총사();

        int [] arr = {-2, 3, 0, 2, -5};
        a.solution(arr);
    }
}
