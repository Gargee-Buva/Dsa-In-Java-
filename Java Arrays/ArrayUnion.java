/* import java.util.*;
public class ArrayUnion {
    public static void main (String [] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};

        HashSet<Integer> set = new HashSet<>();

        // add elements of array a
        for (int i : a) {
            set.add(i);
        }

        // add elements of array b
        for (int i : b) {
            set.add(i);
        }

        // size = number of unique elements
        System.out.println("Distinct elements count = " + set.size());
    }
} */

import java.util.HashSet;
import java.util.*;

public class ArrayUnion {
    public int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        // Add elements from first array
        for (int i : nums1) {
            set.add(i);
        }

        // Add elements from second array
        for (int i : nums2) {
            set.add(i);
        }

        // Create result array
        int[] result = new int[set.size()];

        // Fill array from set
        int index = 0;
        for (int val : set) {
            result[index] = val;
            index = index + 1; 
        }

        return result;
    }
    public static void main (String [] args) { 
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3};
        ArrayUnion obj = new ArrayUnion();
        int[] result = obj.unionArray(nums1, nums2); 

        System.out.println("The array union is as follows : "+ Arrays.toString(result));
    }
}