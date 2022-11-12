package programmers.prac.level1;


import java.util.Arrays;

public class 시저_암호 {

    public String solution(String s, int n) {

        String answer = "";
        char [] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            //대문자
            if(arr[i]>=65 && arr[i]<=90){
                answer+=(arr[i]+n>90)?(char)(64+(arr[i]+n-90)):(char)((int)arr[i]+n);
            }//소문자
            else if(arr[i]>=97 && arr[i]<=122){
                answer+=(arr[i]+n>122)?(char)(96+(arr[i]+n-122)):(char)((int)arr[i]+n);
            }//공백
            else if(arr[i]==' '){
                answer+=arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        시저_암호 a = new 시저_암호();

        String s = "ZA B";
        int n = 1;
        a.solution(s,n);
    }
}
