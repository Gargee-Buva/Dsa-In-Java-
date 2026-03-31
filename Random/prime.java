import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int n) {   // n is the parameter (a placeholder), and number is the argument (actual value from input)
        if(n <= 0) return false;
        if(n == 1) return true;
        
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            } 
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();   //so n decides which type of value goes in the function while number is actual value

        if(isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
