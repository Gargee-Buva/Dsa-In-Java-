import java.util.Scanner;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n; // important

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // input array
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // input k
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // create object
        RotateArray obj = new RotateArray();

        // call function
        obj.rotate(nums, k);

        // print result
        System.out.println("Rotated array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}