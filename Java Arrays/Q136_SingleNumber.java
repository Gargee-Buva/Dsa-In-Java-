public class Q136_SingleNumber {
     public int solution(int[] nums) {
        int result =0;
       for(int i =0; i<nums.length;i++) {
        result = result ^ nums[i];
       }
       return result;
    }
public static void main(String [] args) {
Q136_SingleNumber obj = new Q136_SingleNumber();
int nums[] = {4,1,2,1,2};
System.out.println("Single number is : "+ obj.solution(nums));
}
}