public class MajorityElement {
    public int majorityWins(int[] nums) {
        int freq = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (freq == 0) {
                ans = nums[i];
            }
            if (ans == nums[i]) {
                freq++;
            } else {
                freq--;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        MajorityElement obj = new MajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = obj.majorityWins(nums);
        System.out.println("majorly occuring number = " + result);
    }
}