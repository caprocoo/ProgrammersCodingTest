package theory.java.modern.chap03;

import java.util.Comparator;

/**
 * packageName    : theory.java.modern.chap03
 * fileName       : main
 * author         : caprocoo
 * date           : 2023-01-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-11        caprocoo       최초 생성
 */
public class Chap03Practice {
    public static void main(String[] args) {

//        Supplier<Integer> c1 = () -> new Integer(10);
//        Integer a = c1.get();
//        System.out.println(a);
//
//        Consumer<String> s = (d) -> System.out.println(d);
//        s.accept("Hello");
//
//        Function<Integer, String> function = (i) -> i + "는 내 나이입니다.";
//        String functionStr = function.apply(29);
//        System.out.println(functionStr);
//
//        UnaryOperator<Integer> unaryOperator = i -> i + 10;
//        Integer u = unaryOperator.apply(2);
//        System.out.println(u);
//
//

//
        Student s1 = new Student(10, 1);
        Student s2 = new Student(15, 2);
        Student s3 = new Student(12, 1);
//
//        Comparator<Student> comp = Comparator.comparingInt(Student::getAge);
//        System.out.println(comp.compare(s1,s2));
//
//        Comparator<Integer> getInteger = Comparator.comparingInt(o -> o);
//
        Integer[] arr = {1, 4, 6, 3, 2};
//
//        Arrays.sort(arr, getInteger);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


        Comparator<Student> comparator = Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getClassNumber);
        Comparator<Integer> comparator1 = (o1, o2) -> o2-o1;



    }




}

class AppleComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }

}

class Student{
    private int age;
    private int classNumber;

    public Student(int age, int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }

    public int getAge() {
        return age;
    }

    public int getClassNumber() {
        return classNumber;
    }
}



