public class Q26_RemoveDuplicates {
public int solution(int []nums) {
    if(nums == null && nums.length == 0) return 0;
    int k = 1; 
    //k is the index where the next unique element will be placed.
    //Since the first element is always unique, we start from index 1.
    for (int i =1 ; i<nums.length ; i++) {
        if(nums[i] != nums[i-1]) {
            nums[k] = nums[i];
            k++ ;
        }
    }
    return k;
}
public static void main (String [] args) {
   int nums[] = {0,0,1,1,1,2,2,3,3,4};
   Q26_RemoveDuplicates obj = new Q26_RemoveDuplicates ();
   int result = obj.solution(nums);  
   System.out.println("duplicates are : "+ result);
}
}