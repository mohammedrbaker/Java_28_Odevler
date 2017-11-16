import java.util.Scanner;

/**
 * Created by Mohammed on 16/11/2017.
 * This is a simple program to calculate factorial for a specific number using recursion
 */
public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number to calculate its factorial");
        int result = Factorial(scanner.nextInt());
        System.out.println("The result is: " + result);

    }

    private static int Factorial(int number) {
        if (number == 0)
            return 1;
        // recursion
        return (number * Factorial(number - 1));

    }

}
