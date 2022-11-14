package programmers.prac.level2;

import java.util.Arrays;

public class $$$$H_Index {
    public int solution(int[] citations) {
        int answer = 0;
        int h = citations.length;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            if(citations[i]>=h){
                answer = h;
                break;
            }
            h--;

        }
        return answer;
    }

    public static void main(String[] args) {
        $$$$H_Index g = new $$$$H_Index();
        int [] n = {3,0,6,1,5};
        g.solution(n);
    }
}
