public class SubarrayBruteForce {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length; // Array use .length, not .size()
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int sum = 0; // Reset sum for every new starting point 'i'
            for (int j = i; j < n; j++) { // Added 'int' before j
                sum = sum + nums[j]; // Add current element to the running sum
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String [] args) {
        int [] nums = {9,4,20,3,10,5};
        int k = 33;
        SubarrayBruteForce obj = new SubarrayBruteForce ();
        int result = obj.subarraySum(nums, k);
        System.out.println("Total subarrays with sum " + k + " is: " + result);
    }
}