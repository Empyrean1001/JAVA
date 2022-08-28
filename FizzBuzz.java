import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import javax.lang.model.util.ElementScanner14;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        byte number = scanner.nextByte();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
