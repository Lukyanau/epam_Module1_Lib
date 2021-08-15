package by.epam.lukyanau;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CustomStringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"15","14","98","888"})
    public void shouldReturnTrueIfPositiveValue(String inputNumber){
        boolean actualResult = CustomStringUtils.isPositiveNumber(inputNumber);
        Assertions.assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"-15","-14","-98","-888"})
    public void shouldReturnFalseIfPositiveValue(String inputNumber){
        boolean actualResult = CustomStringUtils.isPositiveNumber(inputNumber);
        Assertions.assertFalse(actualResult);
    }
}
