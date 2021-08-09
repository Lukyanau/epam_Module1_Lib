package by.epam.lukyanau;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomStringUtilsTest {
    @Test
    public void shouldReturnTrueIfPositiveValue(){
        String value = "98";
        boolean expectedResult = true;
        boolean actualResult = CustomStringUtils.isPositiveNumber(value);
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
