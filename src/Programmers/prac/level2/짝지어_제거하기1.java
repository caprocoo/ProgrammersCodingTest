package Programmers.prac.level2;

import java.util.Stack;

public class 짝지어_제거하기1 {
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.empty() && stack.peek()==c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        return stack.isEmpty()?1:0;
    }


    public static void main(String[] args) {
        짝지어_제거하기1 g = new 짝지어_제거하기1();
//        String s = "baabaa";
        String s = "abab";
        g.solution(s);
    }
}
