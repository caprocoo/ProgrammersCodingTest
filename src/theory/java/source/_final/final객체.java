package theory.java.source._final;


class Company1{
    String name = "회사명";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class final객체 {
    public static void main(String[] args) {
        final Company1 company = new Company1();
        //company = new Company(); //객체를 한번 생성했다면 재생성 불가능
        company.setName("ex회사"); //클래스의 필드는 변경가능
    }
}