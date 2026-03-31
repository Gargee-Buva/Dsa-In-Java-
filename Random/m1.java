public class DividingDigits {

    public static int countDividingDigits(int n) {
        int count = 0;
        int original = n; // Store the original number
        
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            n /= 10; // Remove the last digit from n

            // Check if the digit is not 0 and divides the original number
            if (digit != 0 && original % digit == 0) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int n = 1012;
        int result = countDividingDigits(n);
        System.out.println("The number of digits in " + n + " that divide it evenly is: " + result);
    }
}
