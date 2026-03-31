import java.util.Scanner;
public class switch {
    public static void main ( String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user and read an integer
        System.out.print("Enter No1 : ");
        int number = scanner.nextInt();
        System.out.println("You entered No1 : " + number);

        System.out.print("Enter an No2 : ");
        int number = scanner.nextInt();
        System.out.println("You entered No2 : " + number);
        scanner.close();

        switch (choice) {
            case +:
            int result = int No1 + int No2;
            System.out.println("final output = "+ result);
            break;

            case *:
            int result = int No1 * int No2;
            System.out.println("final output = "+ result);
            break;
           
            default:
            System.out.println("wrong choice");
            break;
        }


    }
} 

/* import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user and read two integers
        System.out.print("Enter No1: ");
        int number1 = scanner.nextInt();
        System.out.println("You entered No1: " + number1);

        System.out.print("Enter No2: ");
        int number2 = scanner.nextInt();
        System.out.println("You entered No2: " + number2);

        // Prompt the user to choose an operation
        System.out.print("Enter your choice (+ or *): ");
        char choice = scanner.next().charAt(0);
        scanner.close();

        switch (choice) {
            case '+':
                int sum = number1 + number2;
                System.out.println("Final output = " + sum);
                break;

            case '*':
                int product = number1 * number2;
                System.out.println("Final output = " + product);
                break;

            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
 */