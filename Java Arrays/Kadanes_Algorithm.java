public class Kadanes_Algorithm {
public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
}

public static void main (String [] args) {
    int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
    int result = maxSubArray(nums);
    System.out.println("Max subarray sum is : "+ result);
}
}