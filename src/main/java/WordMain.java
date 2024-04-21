/**
 * packageName    : PACKAGE_NAME
 * fileName       : WordMap
 * author         : caprocoo
 * date           : 2023-09-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-13        caprocoo       최초 생성
 */
public class WordMain {
    public static void main(String[] args) {
        String key = "정책브리핑";

        String data = Word.getData(key);

        System.out.println("data = " + data);


    }
}
