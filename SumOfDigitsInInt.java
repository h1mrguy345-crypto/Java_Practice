import java.util.Scanner;

public class SumOfDigitsInInt {
    static void main() {
        Scanner intinput = new Scanner(System.in);
        System.out.println("in this example, we're going to take your input and add each individual digit together");
        System.out.println("(eg. 12 = 1+2 = 3)");
        System.out.println("type in an integer, up to 999");
        int input = intinput.nextInt();
        int digit1 = input % 10;
        int digit2 = input % 10;
        int digit3 = input % 10;

    }
}
