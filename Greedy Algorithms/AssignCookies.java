import java.util.*;
public class AssignCookies {
public static int findContentChildren (int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);

    int i = 0;
    int j = 0;
    while (i<g.length && j<s.length) {
        if(s[j] >= g[i]) {
            i++ ;
        }
        j++;
    }
    return i;
}
public static void main(String [] args) {
    int [] g = {1,5,3,3,4};
    int [] s = {4,2,1,2,1,3};
    System.out.println("Maximum Children that are satisfied is : " + findContentChildren(g, s));
}
}