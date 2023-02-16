import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        if(num <3){
            System.out.println("0");
        }else{
            for(int i=1; i<=num; i++){
                int a = i/10;
                int b = i%10;

                if((a!=0) && (a == 3 || a == 6|| a==9)){
                    if((b!=0) && (b == 3 || b == 6 || b==9)){
                        System.out.println(i);
                        cnt++; // 두개 다 3, 6, 9
                        continue;
                    }

                    System.out.println(i);
                    cnt++;

                }
                if((b!=0) && (b == 3 || b == 6 || b==9)){
                    System.out.println(i);

                    cnt++;
                }


            }
        }

        System.out.println("cnt = " + cnt);

    }

}
//
