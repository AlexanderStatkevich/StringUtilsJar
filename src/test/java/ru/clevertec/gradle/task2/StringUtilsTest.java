package ru.clevertec.gradle.task2;

import ru.clevertec.utils.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class StringUtilsTest {

    public static final String NUMBER = "1.23";
    public static final String NEGATIVE_NUMBER = "-12.3";
    public static final String NOT_A_NUMBER = "a123";
    public static final String NUMBER_WITH_COMMA = "1,23";

    @Test
    void shouldReturnTrueWhenNumberIsPositive() {
        Assertions.assertTrue(StringUtils.isPositiveNumber(NUMBER));
    }
    @Test
    void shouldReturnFalseWhenNumberIsNegative() {
        Assertions.assertFalse(StringUtils.isPositiveNumber(NEGATIVE_NUMBER));
    }
    @Test
    void shouldThrowExceptionWhenIsNotANumber() {
        Assertions.assertThrows(NumberFormatException.class, ()->StringUtils.isPositiveNumber(NOT_A_NUMBER));
    }

    @Test
    void shouldThrowExceptionWhenWrongNumberFormat() {
        Assertions.assertThrows(NumberFormatException.class, ()->StringUtils.isPositiveNumber(NUMBER_WITH_COMMA));
    }
}