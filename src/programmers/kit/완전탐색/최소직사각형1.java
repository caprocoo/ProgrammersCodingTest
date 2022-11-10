package programmers.kit.완전탐색;

import java.util.Arrays;

public class 최소직사각형1 {

    public int solution(int[][] sizes) {

        int w = 0;
        int h = 0;

        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            if(sizes[i][0]>w){
                w = sizes[i][0];
            }
            if(sizes[i][1]>h){
                h = sizes[i][1];
            }
        }
        return w*h;
    }

    public static void main(String[] args) {
        최소직사각형1 a = new 최소직사각형1();
//        int [][] sizes = {{60,50},{30,70},{60,30},{80,40}};
//        int [][] sizes = {{10,7},{12,3},{8,15},{14,7},{5,15}};
        int [][] sizes = {{14,4},{19,6},{6,16},{18,7},{7,11}};
        a.solution(sizes);
    }

}
