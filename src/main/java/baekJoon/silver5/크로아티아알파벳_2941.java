package baekJoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * packageName    : baekJoon.silver5
 * fileName       : 크로아티아알파벳_2941
 * author         : caprocoo
 * date           : 2024-04-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-24        caprocoo       최초 생성
 */
public class 크로아티아알파벳_2941 {
    public static void main(String[] args) throws IOException{
        크로아티아알파벳_2941 hello = new 크로아티아알파벳_2941();
        hello.result();
    }


    public void result() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(String value : arr){
            str = str.replace(value, "X");
        }
        System.out.println(str.length());
    }

}


