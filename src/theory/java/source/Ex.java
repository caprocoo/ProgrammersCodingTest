package theory.java.source;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * packageName    : theory.java.source
 * fileName       : ex
 * author         : caprocoo
 * date           : 2023-02-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-15        caprocoo       최초 생성
 */
public class Ex {
    public static void main(String[] args) {
        String[] arr = new String[]{"71_1.jpg", "71_2.jpg"};
        Long boardId = Long.valueOf(71);

        int index = arr[0].lastIndexOf("_");

//        System.out.println(index);

        String fileNameSeq = String.valueOf(Arrays.stream(arr)
                .map(e -> Integer.parseInt(e.substring(e.lastIndexOf("_")+1, e.indexOf("."))))
                .collect(Collectors.toList())
                .stream()
                .max(Comparator.comparing(x -> x))
                .orElseGet(() -> 0));


        Arrays.stream(arr)
                        .map(e -> Integer.parseInt(e.substring(e.lastIndexOf("_")+1, e.indexOf(".")))).collect(Collectors.toList()).forEach(System.out::println);

//        System.out.println("fileNameSeq = " + fileNameSeq);


    }
}
