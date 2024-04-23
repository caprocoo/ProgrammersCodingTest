package baekJoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : baekJoon.silver5
 * fileName       : 수정렬하기2_2751
 * author         : caprocoo
 * date           : 2024-04-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-23        caprocoo       최초 생성
 */
public class 수정렬하기2_2751 {

    public static void main(String[] args) throws IOException{
        수정렬하기2_2751 hello = new 수정렬하기2_2751();
        hello.result();
    }

    public void result() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean [] arr = new boolean[2000001];
        int cnt = Integer.parseInt(br.readLine());
        for(int i =0; i<cnt; i++){
            arr[Integer.parseInt(br.readLine())+1000000] = true;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]){
                sb.append((i-1000000)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
