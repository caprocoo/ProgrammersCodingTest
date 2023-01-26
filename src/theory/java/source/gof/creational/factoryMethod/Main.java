package theory.java.source.gof.creational.factoryMethod;

/**
 * packageName    : theory.java.source.gof.creational.factoryMethod
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-01-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-26        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {

        UserFactory userFactory = new NaverUserFactory();
        UserFactory kakaoUserFactory = new KakaoUserFactory();
        User user = userFactory.newInstance();
        User kakaoUser = kakaoUserFactory.newInstance();

    }
}
interface User{
    void signup();
}

class KakaoUser implements User{

    @Override
    public void signup() {
        System.out.println("카카오 아이디로 가입!");
    }
}

class NaverUser implements User {
    @Override
    public void signup() {
        System.out.println("네이버 아이디로 가입!");
    }
}

abstract class UserFactory{
    public User newInstance(){
        User user = createUser();
        user.signup();
        return user;

    }
    protected abstract User createUser();

}

class KakaoUserFactory extends UserFactory {

    @Override
    protected User createUser() {
        return new KakaoUser();
    }

}

class NaverUserFactory extends UserFactory {

    @Override
    protected User createUser() {
        return new NaverUser();
    }
}