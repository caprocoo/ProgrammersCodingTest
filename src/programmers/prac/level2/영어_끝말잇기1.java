package programmers.prac.level2;

import java.util.*;

public class 영어_끝말잇기1 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        boolean v = true;
        for (int i = 0; i < words.length; i++) {
            if(i>0 && words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0) || list.contains(words[i])){
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                v = false;
                break;
            }

            list.add(words[i]);
        }
        if(v) return new int[]{0,0};
        return answer;
    }


    public static void main(String[] args) {
        영어_끝말잇기1 g = new 영어_끝말잇기1();
        int n = 3;
        String [] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        g.solution(n,words);
    }
}
