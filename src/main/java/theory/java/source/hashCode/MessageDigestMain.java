package theory.java.source.hashCode;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * packageName    : theory.java.source.hashCode
 * fileName       : MessageDigesetMain
 * author         : caprocoo
 * date           : 2023-02-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-16        caprocoo       최초 생성
 */
public class MessageDigestMain {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String password = "1";

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] digest = md.digest(password.getBytes(StandardCharsets.UTF_8));
        String sha256 = DatatypeConverter.printHexBinary(digest).toLowerCase();
        String sha20 = sha256.substring(0, 20);
        // SHA-256 메시지 다이제스트 인쇄
        System.out.println(sha256);
    }
}
