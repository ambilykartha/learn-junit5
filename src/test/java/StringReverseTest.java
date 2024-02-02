
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringReverseTest {
    @Test
    void givenStringNull_returnNull(){
        StringReverse nullObj = new StringReverse();
        assertNull(nullObj.reverseString(null));
    }

    @Test
    void givenStringNull_returnNullWithMessage(){
       assertNull(StringReverse.reverseString(null), "The string is null");
    }

    @Test
    void givenStringEmpty_returnEmptyStringWithMessage(){
        assertNotEquals("123","", "The string is empty");
    }
}
