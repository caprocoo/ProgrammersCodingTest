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


    // 1) replace 사용
    public void result() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(String value : arr){
            str = str.replace(value, "X");
        }
        System.out.println(str.length());
    }


//  // 2) 일일이 비교
//    public void result() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        int cnt = 0;
//        for(int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            if(ch == 'c'){
//                if(i<str.length()-1){
//                    if(str.charAt(i+1) == '='){
//                        i++;
//                    }else if(str.charAt(i+1) == '-'){
//                        i++;
//                    }
//                }
//            }
//            else if(ch == 'd'){
//                if(i<str.length()-1){
//                    if(str.charAt(i+1) == 'z'){
//                        if(i<str.length()-2){
//                            if(str.charAt(i+2) == '='){
//                                i+=2;
//                            }
//                        }
//                    }else if(str.charAt(i+1) == '-'){
//                        i++;
//                    }
//                }
//            }
//            else if(ch == 'l'){
//                if(i<str.length()-1){
//                    if(str.charAt(i+1) == 'j'){
//                        i++;
//                    }
//                }
//            }
//            else if(ch == 'n'){
//                if(i<str.length()-1){
//                    if(str.charAt(i+1) == 'j'){
//                        i++;
//                    }
//                }
//            }
//            else if(ch == 's'){
//                if(i<str.length()-1){
//                    if(str.charAt(i+1) == '='){
//                        i++;
//                    }
//                }
//            }
//            else if(ch == 'z'){
//                if(i<str.length()-1){
//                    if(str.charAt(i+1) == '='){
//                        i++;
//                    }
//                }
//            }
//            cnt++;
//        }
//        System.out.println(cnt);
//    }

}


