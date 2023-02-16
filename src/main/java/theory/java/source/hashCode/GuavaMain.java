package theory.java.source.hashCode;

import com.google.common.base.Charsets;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;

/**
 * packageName    : theory.java.source.hashCode
 * fileName       : GuavaMain
 * author         : caprocoo
 * date           : 2023-02-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-16        caprocoo       최초 생성
 */
public class GuavaMain {
    public static void main(String[] args) {

        String password = "SHA-256";

        Hasher hasher = Hashing.sha256().newHasher();
        hasher.putString(password, Charsets.UTF_8);
        HashCode sha256 = hasher.hash();

        System.out.println(sha256);
    }
}
