import java.util.*;

public class patterns {
    public static void main(String args[]) {
        int n = 4;
        int m = 5;
        for (int i = 0; i < n; i++) { // Loop for each row
            for (int j = 0; j < m; j++) { // Loop for each column
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}