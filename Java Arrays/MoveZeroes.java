import java.util.*;
public class MoveZeroes {
    public static void solution(int[] nums) {
         if (nums == null || nums.length <= 1) {
            return; // void method
        }
        int j = 0;
         for(int i=0;i<nums.length;i++){
        if(nums[i]!=0) {
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j] =temp;
            j++ ;
        }
      }
    }
    public static void main (String [] args) {
        int [] nums = {0,1,0,3,12};
        solution(nums);
        System.out.println("after moving zeroes array is as follows : "+ Arrays.toString(nums));
    }
}