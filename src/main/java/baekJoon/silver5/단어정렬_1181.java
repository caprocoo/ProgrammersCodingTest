package baekJoon.silver5;

/**
 * packageName    : baekJoon.silver5
 * fileName       : 단어정렬_1181
 * author         : caprocoo
 * date           : 2024-04-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-22        caprocoo       최초 생성
 */

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.*;



public class 단어정렬_1181 {

    public static void main(String[] args) throws IOException{
        단어정렬_1181 a = new 단어정렬_1181();
        a.result();

    }

    public void result() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        String [] arr = new String [num];
        for(int i=0; i<num; i++){
            arr[i] = br.readLine();
        }

        // sort 매개변수로 compare override
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                // 글자 갯수 비교하여 적은 갯수를 앞으로 보내기
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }
                else{
                    return s1.length()-s2.length();
                }
            };
        });
        sb.append(arr[0]).append('\n');

        for(int i=1; i<num; i++){
            // 중복 시 배열에 추가하지 않기
            if(!arr[i].equals(arr[i-1])){
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}

