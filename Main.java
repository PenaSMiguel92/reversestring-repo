public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[] modString = new char[] { 'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!' };
        System.out.println(modString);
        sol.reverseString(modString);
        System.out.println(modString);
    }
}