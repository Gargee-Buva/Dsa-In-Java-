// 1903 - leetcode
public class OddNumberInString {
    public static String largestOddNumber(String num) {
        if(num==null || num.isEmpty()) {
            return "";
        }
        // traverse from start to end
        for(int i = num.length()-1; i>=0; i--) {
            char ch = num.charAt(i);
            if((ch-'0') % 2 != 0) {         //writing '0' gives ascii value
            return num.substring (0 , i+1) ;
            }
        }
        return "";
    }
    public static void main(String args[]) {
        System.out.println(largestOddNumber(null));      
        System.out.println(largestOddNumber(""));        
        System.out.println(largestOddNumber("4206"));    
        System.out.println(largestOddNumber("35427"));   
    }
}

/*                      

num.length()                Total number of characters     
num.length() - 1            Index of the **last character**
charAt(num.length()-1)      Accesses the **last character**
 */