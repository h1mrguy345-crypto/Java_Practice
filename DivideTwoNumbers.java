import java.util.Scanner;

public class DivideTwoNumbers {
    static void main() {
       while (true) {
        Scanner input1 = new Scanner(System.in);

        System.out.println("let's add two numbers together");
        System.out.println("type in the first number: ");
        if (input1.hasNextDouble()) {
            double value1 = input1.nextDouble();
            System.out.println("your input was: " + value1);
            while (true){
                Scanner input2 = new Scanner(System.in);
                System.out.println("type in the second number: ");
                if (input2.hasNextDouble()){
                    double value2 = input2.nextDouble();
                    System.out.println("your second input was: " + value2);
                    if (value2 == 0){
                        System.out.println("you cannot divide by 0");
                    } else {
                    System.out.println(value1 + " / " + value2 + " = " + (value1 / value2));
                    break;} }
                else {
                    System.out.println("this is not a number");
                }}
        } else {
            System.out.println("this is not a number");
        } break;
    }
}
}
