import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    @DisplayName("Test integer addition")
    //Junit 5 doesn't impose methods to be public
    void shouldTestIntegerAddition(){
        //Arrange
        Calculator calc = new Calculator();

        //Act
        int sum = calc.add(1,4);

        //Assert
        Assertions.assertEquals(5,sum);

    }

    @Test
    @DisplayName("Test integer division")
    void shouldTestIntegerDivision(){
        //Arrange
        Calculator calc = new Calculator();

        //Act
        int result = calc.divide(10,2);

        //Assert
        Assertions.assertEquals(5,result);

    }

    @Test
    @DisplayName("Test division by zero")
        //Junit 5 doesn't impose methods to be public
    void shouldTestDivisionByZero(){
        //Arrange
        Calculator calc = new Calculator();

        //Act
        //Assert
        Assertions.assertThrows(ArithmeticException.class, () -> calc.divide(1,0), "Division by zero not allowed");

    }
}
