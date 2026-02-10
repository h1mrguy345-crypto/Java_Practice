import java.util.Scanner;
//https://stackoverflow.com/questions/58801929/how-to-convert-a-given-length-in-centimeter-and-represent-it-as-a-combination-of
public class FahrenheitToCelsius {
    static void main() {
        Scanner fahrenheit = new Scanner(System.in);
        System.out.println("lets convert Fahrenheit into degrees celsuis: ");
        System.out.println("input a number of degrees Fahrenheit: ");
        double f = fahrenheit.nextDouble();
        System.out.println("your input was: " + f);

        //formula for celsius = (F -32)/1.8
        System.out.println(f + " in degrees celsius becomes " + ((f - 32)/1.8));
    }
}
