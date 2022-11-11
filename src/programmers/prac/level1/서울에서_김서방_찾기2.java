package programmers.prac.level1;

import java.util.Arrays;

public class 서울에서_김서방_찾기2 {

    public String solution(String[] seoul) {
        int cnt = Arrays.asList(seoul).indexOf("Kim");

        String answer = "김서방은 "+cnt+"에 있다";

        return answer;
    }

    public static void main(String[] args) {

        서울에서_김서방_찾기2 abc = new 서울에서_김서방_찾기2();
        String [] arr = {"Jane","Kim"};
        abc.solution(arr);
    }
}
