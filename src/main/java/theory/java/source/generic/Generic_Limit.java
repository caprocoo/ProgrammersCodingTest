package theory.java.source.generic;


/**
 * packageName    : theory.java.source.generic
 * fileName       : Generic_Limit
 * author         : caprocoo
 * date           : 2022-12-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-31        caprocoo       최초 생성
 */

/*
 * 제네릭 제한
 *
 * 제네릭을 사용하면 어떤 타입이 올 수 있는지 제한하지 않으면 오만가집 타입이 올 수 있다.
 * 따라서 자바는 extends, super 키워드를 통해 문법적으로 제한하는 기능을 제공한다.
 *
 *
 * */
class BoxMaterial {
    public String printInfo() {
        return "";
    }
}

class Paper extends BoxMaterial {
    @Override
    public String printInfo() {
        return "종이";
    }
}

class Plastic extends BoxMaterial {
    @Override
    public String printInfo() {
        return "플라스틱";
    }
}


// M extends BoxMaterial 과 같이 선언함으로써 M에는 모든 타입이 아닌 BoxMaterial과 그 자식 클래스만 올 수 있다.
// extends 뒤에 오는 타입이 인터페이스여도 동일하게 extends 키워드를 사용한다.
public class Generic_Limit<M extends BoxMaterial> {
    private M material;
    public Generic_Limit(M material){
        this.material = material;
    }
    public void printInfo() {
        System.out.println(material.printInfo() + "상자입니다.");
    }
    public static void main(String[] args) {
        Generic_Limit<Plastic> plasticBox = new Generic_Limit<>(new Plastic());
        plasticBox.printInfo(); // return 플라스틱상자입니다.
        Generic_Limit<Paper> paper = new Generic_Limit<>(new Paper());
        paper.printInfo();      // return 종이상자입니다.


    }
}

