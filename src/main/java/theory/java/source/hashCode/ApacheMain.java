package theory.java.source.hashCode;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * packageName    : theory.java.source.hashCode
 * fileName       : ApacheMain
 * author         : caprocoo
 * date           : 2023-02-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-16        caprocoo       최초 생성
 */
public class ApacheMain {
    public static void main(String[] args) throws Exception{
        String password = "SHA-256";

        String sha256 = DigestUtils.sha256Hex(password);
        System.out.println(sha256);
    }
}
