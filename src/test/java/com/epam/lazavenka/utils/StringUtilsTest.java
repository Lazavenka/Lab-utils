package com.epam.lazavenka.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @ParameterizedTest
    @ValueSource(strings = {"","abs"," ","-1"," -3.4","3.1","999 44","-e","+1","   2","/1"})
    void isPositiveNumberShouldReturnFalse(String testLine) {
        assertFalse(StringUtils.isPositiveNumber(testLine));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1","99999999","0","123456789012345678909999999999999999","13","444"})
    void isPositiveNumberShouldReturnTrue(String testLine) {
        assertTrue(StringUtils.isPositiveNumber(testLine));
    }

    @ParameterizedTest
    @NullSource
    void isPositiveNumberTestNull(String testLine) {
        assertFalse(StringUtils.isPositiveNumber(testLine));
    }
}