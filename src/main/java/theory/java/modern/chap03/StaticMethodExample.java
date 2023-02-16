package theory.java.modern.chap03;

/**
 * packageName    : theory.java.modern.chap03
 * fileName       : StaticMethodExample
 * author         : caprocoo
 * date           : 2023-01-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-11        caprocoo       최초 생성
 */
public class StaticMethodExample {

    public static void main(String[] args) {
        System.out.println("Lambda Expression");
        IAdd addLambda = (x, y) -> MathUtils.AddElement(x, y);
        System.out.println(addLambda.add(10, 20));

        System.out.println("Method Reference");
        IAdd addMethodRef = MathUtils::AddElement;
        System.out.println(addMethodRef.add(20,40));
    }
}

class MathUtils{
    public static int AddElement(int x, int y) {
        return x + y;
    }
}

@FunctionalInterface
interface IAdd{
    int add(int x, int y);
}