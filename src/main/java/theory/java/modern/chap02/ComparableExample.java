package theory.java.modern.chap02;

import java.util.Arrays;

/**
 * packageName    : theory.java.modern.chap01
 * fileName       : ComparableExample
 * author         : caprocoo
 * date           : 2023-01-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-10        caprocoo       최초 생성
 */
public class ComparableExample {
    public static void main(String[] args) {




        MyInteger[] arr = new MyInteger[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new MyInteger((int) (Math.random() * 100));
        }
        System.out.println("정렬 전 : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i].value + " ");
        }
        System.out.println("정렬 후 : ");
        Arrays.sort(arr);
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i].value + " ");
        }

    }

    static class MyInteger implements Comparable<MyInteger> {
        int value;

        public MyInteger(int value) {
            this.value = value;
        }


        @Override
        public int compareTo(MyInteger o) {
            return this.value - o.value;
        }
    }

}
