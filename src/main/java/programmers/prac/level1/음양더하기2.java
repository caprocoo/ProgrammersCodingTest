package programmers.prac.level1;

public class 음양더하기2 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer+=absolutes[i]*(signs[i]?1:-1);
        }
        return answer;
    }

    public static void main(String[] args) {

        음양더하기2 abc = new 음양더하기2();
//        int [] arr = {4,7,12};
//        boolean[] signs = {true, false, true};

        int [] arr = {1,2,3};
        boolean[] signs = {false, false, true};
        abc.solution(arr, signs);
    }
}
