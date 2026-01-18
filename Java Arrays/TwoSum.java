import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if complement is already in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Store current number and its index
            map.put(nums[i], i);
        }
        return new int[0]; // If no solution found (though problem guarantees one)
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = obj.solution(nums, target);
        if (result.length == 0) {
            System.out.println("No two numbers add up to the target.");
        } else {
            System.out.println("Indices of numbers adding up to " + target + ": " + Arrays.toString(result));
        }
    }
}
