import java.util.Scanner;

public class converttempertureapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Temperature Converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Celsius to Kelvin");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Fahrenheit to Kelvin");
            System.out.println("5. Kelvin to Celsius");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsiusToFahrenheit = celsiusToFahrenheit(scanner.nextDouble());
                    System.out.println("Fahrenheit: " + celsiusToFahrenheit);
                    break;
                case 2:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsiusToKelvin = celsiusToKelvin(scanner.nextDouble());
                    System.out.println("Kelvin: " + celsiusToKelvin);
                    break;
                case 3:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheitToCelsius = fahrenheitToCelsius(scanner.nextDouble());
                    System.out.println("Celsius: " + fahrenheitToCelsius);
                    break;
                case 4:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheitToKelvin = fahrenheitToKelvin(scanner.nextDouble());
                    System.out.println("Kelvin: " + fahrenheitToKelvin);
                    break;
                case 5:
                    System.out.print("Enter temperature in Kelvin: ");
                    double kelvinToCelsius = kelvinToCelsius(scanner.nextDouble());
                    System.out.println("Celsius: " + kelvinToCelsius);
                    break;
                case 6:
                    System.out.print("Enter temperature in Kelvin: ");
                    double kelvinToFahrenheit = kelvinToFahrenheit(scanner.nextDouble());
                    System.out.println("Fahrenheit: " + kelvinToFahrenheit);
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}
