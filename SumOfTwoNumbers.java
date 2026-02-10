import java.util.Scanner;

public class SumOfTwoNumbers {
    static void main() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("let's add two numbers together");
        System.out.println("type in the first number: ");
        int value1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("your input was " + value1);
        System.out.println("now type in the next number: ");
        int value2 = input2.nextInt();
        System.out.println("your input was : " + value2);

        SumOfValues = value1 + value2;
    }

}
