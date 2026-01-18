import java.util.HashMap;

public class isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char chs = s.charAt(i);
            char cht = t.charAt(i);

            if (map1.containsKey(chs)) {
                if (map1.get(chs) != cht) return false;
            } else {
                map1.put(chs, cht);
            }

            if (map2.containsKey(cht)) {
                if (map2.get(cht) != chs) return false;
            } else {
                map2.put(cht, chs);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));   
        System.out.println(isIsomorphic("foo", "bar"));    
        System.out.println(isIsomorphic("paper", "title")); 
    }
}

/*
 everse mapping is necessary to prevent multiple characters from s being 
 assigned to the same character in t — which would violate the one-to-one mapping rule 
 of isomorphic strings.

| Mapping Type | What it Ensures                                      |
| ------------ | ---------------------------------------------------- |
| `s → t`      | One character in `s` maps to one consistent `t` char |
| `t → s`      | No two `s` characters map to the **same** `t` char   |

 */