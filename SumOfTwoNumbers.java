import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfTwoNumbers {
    static void main() {
        Scanner input1 = new Scanner(System.in);
        try {
            System.out.println("let's add two numbers together");
            System.out.println("type in the first number: ");
            int value1 = input1.nextInt();
        } catch(InputMismatchException Exception)
        {System.out.println("this is not an int");} // https://stackoverflow.com/questions/18119211/how-to-check-if-user-input-is-not-an-int-value

        Scanner input2 = new Scanner(System.in);
        System.out.println("your input was " + value1);
        System.out.println("now type in the next number: ");
        int value2 = input2.nextInt();
        System.out.println("your input was : " + value2);

        System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
    }

}
