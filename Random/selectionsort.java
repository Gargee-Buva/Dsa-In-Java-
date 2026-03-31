public class selectionsort {

    public static void printArray(int arr[]) {
        for (int i = 0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args []) {
    int arr [] = {7, 8, 1, 3, 2};
    for(int i = 0 ; i<arr.length-1;i++) {
    int smallest = i;  //it will just hold index and not value;

    for (int j = i+1; j<arr.length;j++) {
    if(arr[smallest]>arr[j]) {
   smallest = j;          //it will just hold index and not value;
    }
    }
    //swap
    int temp = arr[smallest];  //here element needs to be taken care of , arr[smallest] is j
    arr[smallest] = arr[i];
    arr[i] = temp;
 }
 printArray(arr);
    }

}

