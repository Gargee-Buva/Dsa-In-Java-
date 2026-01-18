public class SortColors_approach1 {
    //When your method performs an action but 
    //doesn't return a result (e.g., modifies array in-place).
    public void sortcolors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i<nums.length;i++) {
            if(nums[i]==0) {
                zero ++; 
            }
            else if(nums[i]==1) {
               one ++;
            }
            else if(nums[i]==2) {
               two ++;
            }
        }
        int index = 0;
        for(int i = 0;i<zero;i++) {
            nums[index++] = 0;
        }
        for(int i = 0;i<one;i++) {
            nums[index++] = 1;
        }
        for(int i = 0;i<two;i++) {
            nums[index++] = 2;
        }
    }
    public static void main(String [] args) {
        SortColors_approach1 obj = new SortColors_approach1(); 
        int nums [] = {2,0,2,1,1,0};
        obj.sortcolors(nums);
        //for each element num in array nums
        for (int num : nums) {
          System.out.print(num + " ");
        }
    }

}