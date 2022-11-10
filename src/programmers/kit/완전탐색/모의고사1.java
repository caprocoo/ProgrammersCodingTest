package programmers.kit.완전탐색;

import java.util.ArrayList;

public class 모의고사1 {

    public int[] solution(int[] answers) {
        int [] answer = {};
        int[] first = {1,2,3,4,5};
        int[] twice = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};

        int firstCnt = 0, twiceCnt = 0, thirdCnt = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            if (first[i%first.length] == answers[i]) {
                firstCnt++;
            }
            if (twice[i%twice.length] == answers[i] ) {
                twiceCnt++;
            }
            if (third[i%third.length] == answers[i] ) {
                thirdCnt++;
            }

        }
//        int max = Math.max(firstCnt, Math.max(twiceCnt, thirdCnt));
        int max = Math.max(Math.max(firstCnt, twiceCnt), thirdCnt);
        if (max == firstCnt) list.add(1);
        if (max == twiceCnt) list.add(2);
        if (max == thirdCnt) list.add(3);
//        int[] answer = list.stream().mapToInt(i->i).toArray();
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;

    }


    public static void main(String[] args) {
        모의고사1 a = new 모의고사1();
//        int [] answers = {1,2,3,4,5};
        int[] answers = {1, 3, 2, 4, 2};
        a.solution(answers);
    }

}
