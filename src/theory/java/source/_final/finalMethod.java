package theory.java.source._final;


class Company{

    String name = "회사명";

    public final void print() {
        System.out.println("회사 이름은 :"+name+" 입니다.");
    }
}

class finalMethod extends Company{

    String name = "a회사";

//    메서드 오버라이드 불가능
//    public void print() {
//
//    }
}