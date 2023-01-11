package theory.java.modern.chap03;

/**
 * packageName    : theory.java.modern.chap03
 * fileName       : ObjectMethod
 * author         : caprocoo
 * date           : 2023-01-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-11        caprocoo       최초 생성
 */
public class ObjectMethodExample {
    public static void main(String[] args) {
        // 1. 객체를 생성하는 방법
        ObjectMathUtils om = new ObjectMathUtils();

        System.out.println("Lambda Expression");
        IAdd addLambda = (x, y) -> om.AddElement(x, y);
        System.out.println(addLambda.add(10, 20));

        System.out.println("Method Reference");
        IAdd addMethodRef = om::AddElement;
        System.out.println(addMethodRef.add(20,40));
        
        // 2. 객체 생성 X 방법

        System.out.println("Lambda Expression");
        IAdd addLambda2 = (x, y) -> new ObjectMathUtils().AddElement(x, y);
        System.out.println(addLambda2.add(10, 20));

        System.out.println("Method Reference");
        IAdd addMethodRef2 = new ObjectMathUtils()::AddElement;
        System.out.println(addMethodRef2.add(20,40));


    }

}
class ObjectMathUtils {
    public int AddElement(int x, int y){
        return x + y;
    }

}


