/*
[3, 4, 5, 1, 2] -> one drop at 5 > 1 → valid
[2, 1, 3, 4]    -> two drops (2>1 and 1<3) → invalid
[1, 2, 3, 4, 5] -> sorted, 0 rotations → valid
 */
public class Q1752_ArraySorting {
public boolean check(int [] nums) {
    int count = 0;
    int n = nums.length;
    for(int i=0;i<n;i++) {
        if(nums[i] > nums[(i+1) % n]) {
            count ++;
        }
        if (count > 1) {
         return false;
        }
    }
    return true;
}

public static void main(String [] args) {
Q1752_ArraySorting obj = new Q1752_ArraySorting();
int nums [] = {3,4,5,1,2};
boolean result = obj.check(nums);
System.out.println(result);
}
}