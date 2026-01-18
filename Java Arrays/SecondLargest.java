public class SecondLargest {
public int findSolution (int[] nums)  {
    if(nums==null || nums.length<2) return -1;
    //Start with the lowest possible number, so that any number in the array will be greater and can replace it
    int largest = Integer.MIN_VALUE;
    int secondlargest = Integer.MIN_VALUE;
    for(int num : nums) {
        if(num>largest) {
            secondlargest = largest;
            largest = num;
        }
        else if(num>secondlargest && num != largest) {
            secondlargest = num;
        }
    }
     // If secondLargest wasn't updated, it means no valid second largest
     return (secondlargest == Integer.MIN_VALUE) ? -1 : secondlargest;
     //(condition) ? valueIfTrue : valueIfFalse;

}

public static void main(String[] args) {
SecondLargest  obj = new SecondLargest ();
int[] nums = {5,5,5};
System.out.println("Second largest element in the array is : "+ obj.findSolution(nums)) ;
}
}