package Programmers.kit.hash;

import java.util.HashMap;

public class 완주하지_못한_선수1 {

    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> hash = new HashMap<>();
        String answer = "";

        for (String p : participant) {
            hash.put(p, hash.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            hash.put(c, hash.get(c) - 1);
        }

        for (String k : hash.keySet()) {
            int v = hash.get(k);
            if (v != 0) {
                answer = k;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        String[] p = {"mislav", "stanko", "mislav", "ana"};
        String[] c = {"stanko", "ana", "mislav"};

        String[] b = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] d = {"josipa", "filipa", "marina", "nikola"};
        완주하지_못한_선수1 a = new 완주하지_못한_선수1();
        a.solution(p, c);
//        a.solution(b,d);
    }
}
