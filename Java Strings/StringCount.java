// check whether every opening parentheses has matching closing parentheses
public class StringCount {
    public static boolean matchFunction(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            
            if(c =='(') {
                count++;
            }
            else {
                count--;
            }
            // invalid if more closing than opening
            if (count < 0) return false;
        }
        return count == 0;
    }
    public static void main(String [] args) {
        String s = "(()(()))";
        System.out.println(matchFunction(s));
    }
}