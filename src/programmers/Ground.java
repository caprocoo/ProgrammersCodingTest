package programmers;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Locale;

public class Ground {

    public static void main(String[] args) {

//        IntStream intStream = new Random().ints(7,1, 34).distinct();
//        intStream.forEach(System.out::println);
//        int[] arr = {1,3,4,2,6};
//        String [] ar = {"dd", "aa","bbc", "acb"};
//        Stream<String> str = Arrays.stream(ar).sorted((s1, s2) -> s1.compareTo(s2));
//        List<String> str = Arrays.stream(ar).sorted(String::compareTo).filter((item)-> item.length()>2).collect(Collectors.toList());
//
//
//        Stream<String[]> strArrStrm = Stream.of(
//                new String[]{"abc", "def", "jkl"},
//                new String[]{"ABC", "GHI", "JKL"}
//        );
//
//
//        Stream<String> stream = strArrStrm.flatMap(Arrays::stream);
//        stream.map(String::toLowerCase).distinct().sorted().forEach(System.out::println);


        String[] a = {
                "Believe or not It is true",
                "Do or do not There     is no try"
        };

        Stream<String> lineStream = Arrays.stream(a);
//        lineStream.forEach(System.out::println);
        lineStream.flatMap(s->Stream.of(s.split(" +"))).map(String::toLowerCase).distinct().sorted().forEach(System.out::println);



        




//        Stream<Integer> stream = (Stream<Integer>) Arrays.stream(arr).sorted();



    }


}
