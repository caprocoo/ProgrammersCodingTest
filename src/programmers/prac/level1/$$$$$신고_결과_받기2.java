package programmers.prac.level1;


import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class $$$$$신고_결과_받기2 {

    public int[] solution(String[] id_list, String[] report, int k) {
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        System.out.println(list);
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }

        int [] arr =Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();


        return arr;
    }




    public static void main(String[] args) {

        $$$$$신고_결과_받기2 a = new $$$$$신고_결과_받기2();

        String [] id_list = {"muzi", "frodo", "apeach", "neo"};
        String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        a.solution(id_list, report, k);
    }
}
