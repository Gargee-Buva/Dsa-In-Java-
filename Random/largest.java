public class largest {
    public static void main (String[] args) {
        int [] array  = {10,20,30,40,80,100};
        int big = array[0];
        for (int i = 1; i<array.length;i++) {
            if (array[0]<array[i]) {
                big = array[i];
            }
        }
       
        System.out.println("the largest element is : " +  big);
    }
}