package baekJoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * packageName    : baekJoon.silver5
 * fileName       : 좌표정렬하기_11650
 * author         : caprocoo
 * date           : 2024-04-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-24        caprocoo       최초 생성
 */
class 좌표정렬하기_11650 {
    public static void main(String[] args) throws IOException{
        좌표정렬하기_11650 hello = new 좌표정렬하기_11650();
        hello.result();
    }


    // 1) compare override 사용
    public void result() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        int[][] arr = new int[cnt][2];
        StringTokenizer st;

        for(int i=0; i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
            public int compare(int[] i1, int[] i2){
                if(i1[0]==i2[0]) return i1[1]-i2[1];
                else return i1[0]-i2[0];
            };
        });

        for(int i=0; i<cnt; i++){
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}

