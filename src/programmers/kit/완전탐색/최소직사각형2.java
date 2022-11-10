package programmers.kit.완전탐색;

public class 최소직사각형2 {

    public int solution(int[][] sizes) {

        int w = 0;
        int h = 0;

        for (int[] a: sizes) {
            w = Math.max(w, Math.max(a[0], a[1]));
            h = Math.max(h, Math.min(a[0], a[1]));
        }
        return w*h;
    }

    public static void main(String[] args) {
        최소직사각형2 a = new 최소직사각형2();
//        int [][] sizes = {{60,50},{30,70},{60,30},{80,40}};
//        int [][] sizes = {{10,7},{12,3},{8,15},{14,7},{5,15}};
        int [][] sizes = {{14,4},{19,6},{6,16},{18,7},{7,11}};
        a.solution(sizes);
    }

}
