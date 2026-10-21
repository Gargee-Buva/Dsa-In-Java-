public class Leetcode852 {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 1;
        int end = n-2;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                return arr[mid];
            }
            //right
            else if(arr[mid-1]<arr[mid]){
                start = mid +1;
            }
            //left
            else {
                end = mid -1;
            }
        }
        return 1;
    }
    public static void main(String [] args){
        Leetcode852 obj = new Leetcode852();
        int [] arr = {0,3,8,9,5,2};
        int result = obj.peakIndexInMountainArray(arr);
        System.out.println("The peak from the array is : "+ result);
    }
}