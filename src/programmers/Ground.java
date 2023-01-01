package programmers;


import java.util.List;
import java.util.Optional;
//
//public class Ground {
//
//
//    public static void main(String[] args) {
//
//    }
//    public void method() {
//        int a=1;
//        int b=2;
//        int c= add(a, b);
//        int d= add(a, c);
//    }
//
//    private int add(int a, int b) {
//        return a + b;
//    }
//}

public class Ground {

    public static void main(String[] args) {

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);
        System.out.println(optionalEmpty.isPresent()); // false

        Optional<String> opt = Optional.ofNullable(Object.class.getName());
        String name = opt.orElse("isNull");
        System.out.println(name);
    }
}

