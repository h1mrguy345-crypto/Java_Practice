import java.util.Scanner;

public class BeginningPrinter {
    //task:Write a Java program to print 'Hello' on screen and your name on a separate line.
    static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.println("what is your name?");

        System.out.println("Hello" + name);

    }


}
