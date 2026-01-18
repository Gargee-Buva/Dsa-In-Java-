//125
public class ValidPalindrome {
public boolean isPalindrome(String s) {
if(s.isEmpty()) {
    return true;
}
int left = 0;
int right = s.length()-1 ;

while(left<=right) {
    char leftChar = s.charAt(left);
    char rightChar = s.charAt(right);
//If the character is a space, punctuation, or symbol (i.e., not a letter or digit), 
//we skip it using this condition
    if(!Character.isLetterOrDigit(leftChar)) { 
        left ++;
    }
    else if(!Character.isLetterOrDigit(rightChar)) {
        right --;
    }
    
          else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        
    }
    return true;
}

public static void main(String [] args) {
ValidPalindrome obj = new ValidPalindrome();
String s = "A man, a plan, a canal: Panama";
boolean result = obj.isPalindrome(s);
System.out.println(result);
}
}




/*
Character is a class (with a capital C)
isLetterOrDigit() is a method inside that class
 */