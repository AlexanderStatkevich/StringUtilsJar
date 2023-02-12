package ru.clevertec.utils;

import org.apache.commons.lang3.math.NumberUtils;


public final class StringUtils {

    private StringUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * A method for positive number checking
     * @param number string representing integer or decimal numbers
     * @return true is number is positive
     * @throws NumberFormatException if string doesn't represent number
     */
    public static boolean isPositiveNumber (String number){
       return NumberUtils.createBigDecimal(number).signum() > 0;
    }
}