package theory.java.source.generic;

/**
 * packageName    : theory.java.source.generic
 * fileName       : Generic_Class
 * author         : caprocoo
 * date           : 2022-12-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-29        caprocoo       최초 생성
 */


/*
 * 제네릭 메서드
 *
 * 출처 : https://atoz-develop.tistory.com/entry/JAVA-%EC%A0%9C%EB%84%A4%EB%A6%ADGenerics-%ED%81%B4%EB%9E%98%EC%8A%A4%EC%99%80-%EB%A9%94%EC%86%8C%EB%93%9C
 * */



public class Generic_Method<T> {
    /*
    * 1. 제네릭 메서드 사용
    * 제네릭은 클래스 레벨에서만 사용할 수 있는게 아니라 메소드 레벨에서도 사용할 수 있다.
    * 제네릭 타입을 선언한 메소드를 제네릭 메소드라 한다.
    * 클래스의 제네릭 타입이 전역 변수처럼 사용된다면 메소드의 제네릭 타입은 해당 메소드 안에서만 사용할 수 있는 지역성을 갖는다.
    * */
    public <T> Generic_Class makeGeneric(T capsule) {
        return new Generic_Class(capsule);
    }

    public static void main(String[] args) {
        Generic_Method generic_method = new Generic_Method();
        Generic_Class item = new Generic_Class();
        // method 사용
        generic_method.<Generic_Class>makeGeneric(item);    // 제네릭 사용
        generic_method.makeGeneric(item);                   // 타입이 추정 가능하므로 생략이 가능


    }
}
