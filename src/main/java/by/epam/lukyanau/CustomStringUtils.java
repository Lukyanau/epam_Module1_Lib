package by.epam.lukyanau;

import org.apache.commons.lang3.StringUtils;

public class CustomStringUtils {
    public static boolean isPositiveNumber(String number){
        return StringUtils.isNumeric(number);
    }
}
