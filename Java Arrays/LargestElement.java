public class LargestElement {
public int findLargest(int[] nums) {
    if (nums == null || nums.length == 0) {
    throw new IllegalArgumentException("Array is empty or null");
    }
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i]; // Update max if a larger element is found
            }
        }
        return max;
}


    public static void main (String[] args) {
    LargestElement obj = new LargestElement();
    int[] nums = {3, 5, 1, 8, 4};
    System.out.println("Largest element: " + obj.findLargest(nums)); 
    }
}




