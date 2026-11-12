
package com.example;

public class App {

    public static double celsiusToFahrenheit(double celsius) {
        validateTemperature(celsius, -273.15);
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        validateTemperature(fahrenheit, -459.67);
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        validateTemperature(celsius, -273.15);
        return celsius + 273.15;
    }

    private static void validateTemperature(double temperature, double minimum) {
        if (!Double.isFinite(temperature)) {
            throw new IllegalArgumentException("Temperature must be a finite number");
        }

        if (temperature < minimum) {
            throw new IllegalArgumentException(
                "Temperature cannot be below absolute zero"
            );
        }
    }
}
