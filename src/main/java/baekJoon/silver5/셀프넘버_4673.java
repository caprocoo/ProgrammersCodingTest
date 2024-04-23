package baekJoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : baekJoon.silver5
 * fileName       : 셀프넘버_4673
 * author         : caprocoo
 * date           : 2024-04-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-23        caprocoo       최초 생성
 */
public class 셀프넘버_4673 {
    public static void main(String[] args) throws IOException{
        셀프넘버_4673 hello = new 셀프넘버_4673();
        hello.result();
    }

    public void result() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean [] arr = new boolean[10001];
        arr[0] = true;
        for(int i=1; i<arr.length+1; i++){
            int cnt = selfNum(i);
            if(cnt != -1 && cnt<arr.length){
                arr[cnt] = true;
            }
        }

        for(int i=1; i<arr.length+1; i++){
            if(arr[i] == false){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int selfNum(int num){
        if(num>0){
            int cnt = num;
            while(num>0){
                cnt += (num%10);
                num /=10;
            }
            return cnt;
        }else{
            return -1;
        }
    }
}

