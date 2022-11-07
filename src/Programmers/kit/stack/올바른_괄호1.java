package Programmers.kit.stack;

public class 올바른_괄호1 {
    boolean solution(String s) {
        int cnt = 0;
        if(s.charAt(0)!='('){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
//            if(arr[i].equals("(")){
            if(s.charAt(i)=='('){
                cnt++;
            }
//            if(arr[i].equals(")")){
            if(s.charAt(i)==')'){
                cnt--;
            }
            if(cnt<0){
                break;
            }
        }
        if(cnt==0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        올바른_괄호1 p = new 올바른_괄호1();

//        String a = "()()";
//        String a = "(())()";
        String a = ")()(";
//        String a = "(()(";
        p.solution(a);



    }
}
