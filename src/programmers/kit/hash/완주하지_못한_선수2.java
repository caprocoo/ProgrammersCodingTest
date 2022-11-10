package programmers.kit.hash;

import java.util.*;

public class 완주하지_못한_선수2 {

    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> hash = new HashMap<>();
        String answer = "";

        for (String p : participant) {
            hash.put(p, hash.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            hash.put(c, hash.get(c) - 1);
        }

        Iterator<Map.Entry<String, Integer>> iterator = hash.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};

        완주하지_못한_선수2 a = new 완주하지_못한_선수2();
        a.solution(participant, completion);


    }

}
