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
 * 제네릭 클래스
 *
 * 출처 : https://atoz-develop.tistory.com/entry/JAVA-%EC%A0%9C%EB%84%A4%EB%A6%ADGenerics-%ED%81%B4%EB%9E%98%EC%8A%A4%EC%99%80-%EB%A9%94%EC%86%8C%EB%93%9C
 * */

// 1. 일반적으로 사용하는 Generic Class
public class Generic_Class<T> {
    public Generic_Class() {
    }

    public Generic_Class(T item) {
        this.item = item;
    }

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    // 2. 콤마로 구분해서 여러 개를 선언할 수 있다.
    public class Generic_Class2<M, I> {

        private M item1;
        private I item2;

        public M getItem1() {
            return item1;
        }

        public void setItem1(M item1) {
            this.item1 = item1;
        }

        public I getItem2() {
            return item2;
        }

        public void setItem2(I item2) {
            this.item2 = item2;
        }
    }

    public void main(String[] args) {
        
        Generic_Class2<String, String> gc = new Generic_Class2<>(); // JDK 1.7부터 생략 가능
        Generic_Class2 g = new Generic_Class2();                    // Object로 간주

        /*
        * 제네릭은 JDK 1.5부터 도입되었는데 하위 호환을 위해 타입을 지정하지 않고도 객체를 생성할 수 있으며 이런 경우 타입은 Object로 간주된다.
        * 주의해야 할 점은 참조변수에서 지정한 타입과 생성자에서 지정한 타입은 반드시 일치해야 한다.
        * 두 타입이 서로 상속관계에 있다 해도 타입이 다르면 컴파일 에러가 발생한다.
       * */
        
    }

}
