public class arrayascending {
    public static int isSorted(int n, int[] a) {
        for (int i = 1; i < n; i++) { // Start from i = 1 to avoid ArrayIndexOutOfBounds
            if (a[i] < a[i - 1]) { // If current element is less than the previous one
                return 0; // Array is not sorted
            }
        }
        return 1; // Array is sorted
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = a.length;
        System.out.println(isSorted(n, a)); // Output: 1 (sorted)
    }
}
