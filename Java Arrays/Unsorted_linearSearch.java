public class Unsorted_linearSearch {
public int search(int[] nums,int target) {
for (int i = 0; i < nums.length; i++) {
        if (nums[i] == target) {
            return i;
        }
    }
    return -1; // not found
}


public static void main (String args[]) {
int nums [] = {2, -4, 4, 0, 10};
int target = 6;
Unsorted_linearSearch obj = new Unsorted_linearSearch ();
int result = obj.search(nums , target);
System.out.println(result);
}
}