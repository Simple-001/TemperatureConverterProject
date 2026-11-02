/**
 * Converts temperatures between Celsius, Fahrenheit, and Kelvin.
 * Each method is independent and does not call any other method.
 */
public class TemperatureConverter {

    /** F = (C * 9.0 / 5.0) + 32 */
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    /** C = (F - 32) * 5.0 / 9.0 */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    /** K = C + 273.15 */
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
