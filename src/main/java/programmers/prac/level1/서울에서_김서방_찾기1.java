package programmers.prac.level1;

public class 서울에서_김서방_찾기1 {

    public String solution(String[] seoul) {
        int cnt = 0;
        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")){
                cnt = i;
                break;
            }
        }
        String answer = "김서방은 "+cnt+"에 있다";

        return answer;
    }

    public static void main(String[] args) {

        서울에서_김서방_찾기1 abc = new 서울에서_김서방_찾기1();
        String [] arr = {"Jane","Kim"};
        abc.solution(arr);
    }
}
