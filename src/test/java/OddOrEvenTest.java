import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OddOrEvenTest {
    @Test
    void givenNumberEven_trueIsReturned(){
        OddOrEven evenObj = new OddOrEven();
        assertTrue(evenObj.isNumberOddOrEven(10));
    }

    @Test
    void givenNumberOdd_falseReturned(){
        OddOrEven oddObj = new OddOrEven();
        assertFalse(oddObj.isNumberOddOrEven(11));
    }

}
