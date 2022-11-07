package Programmers.kit.hash;

import java.util.HashMap;

public class 위장1 {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hash = new HashMap<>();

        for(String [] cloth : clothes){
            String type = cloth[1];
            hash.put(type, hash.getOrDefault(type, 0)+1);
        }
        System.out.println("hash = " + hash);

        for(String k : hash.keySet()){
            answer *= hash.get(k)+1;
        }


        return answer-1;
    }

    public static void main(String[] args) {

        위장1 p = new 위장1();

//        String[][] arr = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};

        String [][] arr = {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}};

        System.out.println(p.solution(arr));



    }
}
