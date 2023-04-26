package programmers.prac.level1;

import java.util.HashMap;

/**
 * packageName    : programmers.prac.level1
 * fileName       : 달리기_경주
 * author         : caprocoo
 * date           : 2023-04-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-26        caprocoo       최초 생성
 */
public class 달리기_경주 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        달리기_경주 s = new 달리기_경주();
        s.solution(players, callings);

//        result : ["mumu", "kai", "mine", "soe", "poe"]
    }

    public String[] solution(String[] players, String[] callings) {
        // 배열을 사용했지만 시간초과로 실패
//        List<String> strings = new ArrayList<>(List.of(players));
//
//        for (int i = 0; i <callings.length; i++) {
//            int changeNumber = strings.indexOf(callings[i]) - 1;
//            strings.remove(strings.indexOf(callings[i]));
//            strings.add(changeNumber, callings[i]);
//        }
//        String[] answer = strings.toArray(new String[0]);


        String[] answer = new String[players.length];
        HashMap<Integer, String> mappedByRank = new HashMap<>();
        HashMap<String, Integer> mappedByPerson = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            mappedByRank.put(i, players[i]);
            mappedByPerson.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {

            Integer index = mappedByPerson.get(callings[i]);
            String player = mappedByRank.get(index);

            String frontPlayer = mappedByRank.get(index - 1);

            mappedByPerson.put(player, index - 1);
            mappedByPerson.put(frontPlayer, index);

            mappedByRank.put(index - 1, player);
            mappedByRank.put(index, frontPlayer);

        }
        for (int i = 0; i < players.length; i++) {
            answer[i] = mappedByRank.get(i);
        }


        return answer;
    }
}
