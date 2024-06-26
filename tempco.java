import java.util.Scanner;

class tempco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        double temp;
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temp = sc.nextDouble();
                double fahrenheit = celsiusToFahrenheit(temp);
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temp= sc.nextDouble();
                double celsius = fahrenheitToCelsius(temp);
                System.out.println("Temperature in Celsius: " + celsius);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    public static double celsiusToFahrenheit(double celsius) 
     {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) 
    {
        return (fahrenheit - 32) * 5 / 9;
    }
}
