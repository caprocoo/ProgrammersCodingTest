package Programmers.prac.level2;

import Programmers.Ground;

public class 카펫1 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown+yellow;
        for (int i = 3 ; i <= total; i++) {
            int col = i;
            int row = total/col;
            if(row<3) continue;
            if(row>=col){
                if((row-2)*(col-2) == yellow){
                    answer[0] = row;
                    answer[1] = col;
                    return answer;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        카펫1 g = new 카펫1();
        int brown = 10;
        int yellow = 2;
        g.solution(brown, yellow);
    }
}
