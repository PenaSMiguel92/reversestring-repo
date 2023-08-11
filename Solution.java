import java.util.*;

public class Solution {
    public void reverseString(char[] s) {
        
        for (int index = 0; index < s.length / 2; index++) {
            char curVal = s[index];
            s[index] = s[s.length - index - 1];
            s[s.length - index - 1] = curVal;
            System.out.println(Arrays.toString(s));
        }
    }
}
