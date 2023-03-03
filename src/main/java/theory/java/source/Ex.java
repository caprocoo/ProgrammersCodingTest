package theory.java.source;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * packageName    : theory.java.source
 * fileName       : ex
 * author         : caprocoo
 * date           : 2023-02-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-15        caprocoo       최초 생성
 */
public class Ex {
    public static void main(String[] args) {

        Date today = new Date();
        Locale currentLocale = new Locale("KOREAN", "KOREA");
        String pattern = "yyyyMMddHHmmss"; //hhmmss로 시간,분,초만 뽑기도 가능
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, currentLocale);
        System.out.println(formatter.format(today));

    }
}
