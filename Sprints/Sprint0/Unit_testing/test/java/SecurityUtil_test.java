import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import util.SecurityUtil;

/*
    The hashPassword function is supposed to take a string and converts it to a SHA-256 hash
 */
public class SecurityUtil_test {

    @ParameterizedTest(name = "Password: {0} should hash to {1}")
    @CsvSource({
            "12345, 03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4",
            "qwerty, 65e84be33532fb784c48129675f9eff3a682b27168c0ea744b2cf58ee02337c5",
            "asdasd, 5fd924625f6ab16a19cc9807c7c506ae1813490e4ba675f843d5a10e0baacdb8"
    })
    void test_password(String password, String expectedHash) {
        String hash = SecurityUtil.hashPassword(password);
        assertEquals(hash, expectedHash);

    }

}
