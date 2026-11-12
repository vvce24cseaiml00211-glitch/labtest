
package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(212.0, App.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    public void testZeroCelsiusToFahrenheit() {
        assertEquals(32.0, App.celsiusToFahrenheit(0), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(100.0, App.fahrenheitToCelsius(212), 0.01);
    }

    @Test
    public void testNegativeFahrenheit() {
        assertEquals(-40.0, App.fahrenheitToCelsius(-40), 0.01);
    }

    @Test
    public void testCelsiusToKelvin() {
        assertEquals(24.44, App.celsiusToKelvin(0), 0.01);
    }

    @Test
    public void testNegativeCelsiusToKelvin() {
        assertEquals(233.15, App.celsiusToKelvin(-40), 0.01);
    }

    @Test
    public void testAbsoluteZeroToKelvin() {
        assertEquals(0.0, App.celsiusToKelvin(-273.15), 0.01);
    }

    @Test
    public void testBelowAbsoluteZero() {
        assertThrows(IllegalArgumentException.class,
            () -> App.celsiusToKelvin(-300));
    }

    @Test
    public void testInvalidFahrenheit() {
        assertThrows(IllegalArgumentException.class,
            () -> App.fahrenheitToCelsius(-500));
    }

    @Test
    public void testInvalidInput() {
        assertThrows(IllegalArgumentException.class,
            () -> App.celsiusToFahrenheit(Double.NaN));
    }
}
