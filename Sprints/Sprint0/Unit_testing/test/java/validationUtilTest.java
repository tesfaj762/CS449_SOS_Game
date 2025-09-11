import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;


import util.ValidationUtil;

public class validationUtilTest {

    String num1 = "1234";
    String num2 = "ab45";
    String num3 = "435";
    
    @Test
    public void validationTest() {

        assertTrue(ValidationUtil.validNumber(num1));
        assertFalse(ValidationUtil.validNumber(num2));
        assertTrue(ValidationUtil.validNumber(num3));

    }

}
