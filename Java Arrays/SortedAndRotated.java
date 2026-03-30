import java.util.Scanner;

public class SortedAndRotated {

    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
        }
        
        SortedAndRotated obj = new SortedAndRotated();

        boolean result = obj.check(nums);

        System.out.println(result);

        sc.close();
    }
}