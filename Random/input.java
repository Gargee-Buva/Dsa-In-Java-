import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user and read an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

        // Clear the newline character left by nextInt
        scanner.nextLine();

        // Prompt the user and read a string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.println("You entered: " + text);

        // Prompt the user and read a double
        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble();
        System.out.println("You entered: " + decimal);

        // Close the scanner
        scanner.close();
    }
}
/*nextInt(): Reads an integer.
nextDouble(): Reads a double.
nextLine(): Reads a line of text.
next(): Reads a word (up to whitespace). */