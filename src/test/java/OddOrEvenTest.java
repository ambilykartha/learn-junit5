import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


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

    @ParameterizedTest
    @DisplayName("Check even numbers")
    @ValueSource(ints = {2,4,6,8,10})
    void shouldReturnTrueForTheGivenEvenNumbersInputs(int input){
        //Approach
        OddOrEven evenObj = new OddOrEven();

        //Act
        boolean isEven = evenObj.isNumberOddOrEven(input);

        //Assert
        Assertions.assertTrue(isEven);
    }

}
