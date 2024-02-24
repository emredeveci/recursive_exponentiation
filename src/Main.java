import java.util.Scanner;

public class Main {


    static int calculatePower(int base, int exponent) {
        if (exponent == 0)
            return 1;
        else
            return base * calculatePower(base, exponent - 1);
    }

    public static void main(String[] args) {
        //scanner initialization and variable definitions
        Scanner scanner = new Scanner(System.in);
        int base, exponent;

        //user inputs
        System.out.print("Please enter the base number: ");
        base = scanner.nextInt();
        System.out.print("Please enter the exponent(a non-negative integer): ");
        exponent = scanner.nextInt();

        //printing the result to the user calling the recursive method
        System.out.println("The result is: " + calculatePower(base, exponent));
    }
}