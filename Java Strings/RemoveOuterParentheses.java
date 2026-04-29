/*the question 1021 leetcode itself states that it expects what's inside 
the outer brackets and not the outer brackets itself hence on the outer brackets 
depth is always 0 both opening and closing and we do not include them*/
public class RemoveOuterParentheses {
    public static String Removingfunction(String s){
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for(char c : s.toCharArray()){
            if(c == '(') {
                if (depth>0) result.append(c);
                depth++;
            }
            // for ')'
            else {
                depth--;
                if (depth > 0) result.append(c);
            }
        }
        return result.toString();
    }
    public static void main (String [] args) {
        String s = "(()())(())";
        System.out.println("the valid parentheses is: "+ Removingfunction(s));
    }
}