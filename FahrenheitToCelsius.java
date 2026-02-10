import java.util.Scanner;

public class FahrenheitToCelsius {
    static void main() {
        Scanner fahrenheit = new Scanner(System.in);
        System.out.println("lets convert Fahrenheit into degrees celsuis: ");
        System.out.println("input a number of degrees Fahrenheit: ");
        double f = fahrenheit.nextDouble();
        System.out.println("your input was: " + f);
    }
}
