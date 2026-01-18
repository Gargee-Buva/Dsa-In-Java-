public class ReverseWords {
    public String solution(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder(); //rearrangement i.e mutation
         for(int i = words.length-1 ; i>=0 ; i--) {
            reversed.append(words[i]);
            if(i!=0) {
                reversed.append(" "); //adds space after the word
            }
        }
        return reversed.toString();
    }
    public static void main(String [] args) {
        ReverseWords obj = new ReverseWords();
        String s = "  hello world  ";
        String result = obj.solution(s);
        System.out.println(result);
    }
}

/*
"\\s+" is a regular expression:

\\s → any whitespace (space, tab, newline)

+ → one or more times
 */

//  words[] is essential — it gives us direct access to the words we want to rearrange.