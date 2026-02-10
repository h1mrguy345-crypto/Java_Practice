import java.util.Scanner;

public class SumOfTwoNumbers {
    static void main() {
        while (true) {
            Scanner input1 = new Scanner(System.in);

            System.out.println("let's add two numbers together");
            System.out.println("type in the first number: ");
            if (input1.hasNextInt()) {
                int value1 = input1.nextInt();
                System.out.println("your input was: " + value1);
                while (true){
                    Scanner input2 = new Scanner(System.in);
                System.out.println("type in the second number: ");
                if (input2.hasNextInt()){
                int value2 = input2.nextInt();
                System.out.println("your second input was: " + value2);
                System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
                break;}
                else {
                    System.out.println("this is not a number");
                }}
            } else {
                System.out.println("this is not a number");
            }
        }
    }
}
