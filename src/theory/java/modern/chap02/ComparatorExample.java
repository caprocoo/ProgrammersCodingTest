package theory.java.modern.chap02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * packageName    : theory.java.modern.chap01
 * fileName       : ComparatorExample
 * author         : caprocoo
 * date           : 2023-01-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-10        caprocoo       최초 생성
 */
public class ComparatorExample {

    static Comparator<MyInteger> comp = new Comparator<MyInteger>() {
        @Override
        public int compare(MyInteger o1, MyInteger o2) {
            return o2.value- o1.value;
        }
    };

    public static void main(String[] args) {

        MyInteger[] arr = new MyInteger[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new MyInteger((int) (Math.random() * 100));
        }
        System.out.println("정렬 전 : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i].value+" ");
        }
        System.out.println();

        Arrays.sort(arr, comp);
        System.out.println("정렬 후 : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i].value+" ");
        }


    }

    static class MyInteger{
        int value;

        public MyInteger(int value) {
            this.value = value;
        }

    }
}
