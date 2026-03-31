import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Take the user input for the n-th term of the Fibonacci series:");
        int n = number.nextInt();
        System.out.println("Input: " + n);
        
        Solution obj = new Solution();
        int finalRes = obj.fibonacci(n);  
        System.out.println("The " + n + "-th Fibonacci number is: " + finalRes);
        
        number.close();
    }

    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;  // Base case: F(1) = 1, F(2) = 1
        }
        
        
        int prev1 = 1, prev2 = 1, current = 0;
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;  // F(n) = F(n-1) + F(n-2)
            prev2 = prev1;
            prev1 = current;
        }
        
        return current;
    }
}
