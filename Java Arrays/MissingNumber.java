public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actual_sum = 0;
        int expected_sum = n * (n + 1) / 2;
        for (int num : nums) {
            actual_sum += num;
        }
        return expected_sum - actual_sum;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6};
        MissingNumber obj = new MissingNumber();
        int result = obj.missingNumber(nums);
        System.out.println("Missing number is: " + result);
    }
}