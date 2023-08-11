
public class Solution {
    public void reverseString(char[] s) {
        char curVal;
        for (int index = 0; index < s.length / 2; index++) {
            curVal = s[index];
            s[index] = s[s.length - index - 1];
            s[s.length - index - 1] = curVal;
        }
    }
}
