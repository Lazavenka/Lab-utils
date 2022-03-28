package com.epam.lazavenka.utils;

/**
 * String utils class
 * @author Lazavenka
 */
public class StringUtils {
    /**
     *
     * Tests a string to see if it contains a positive number.
     * Uses apache.commons.lang3.StringUtils.
     *
     * @param str String value to test
     * @return true if string consist of only digits.
     */
    public static boolean isPositiveNumber(String str){
        return org.apache.commons.lang3.StringUtils.isNumeric(str);
    }
}
