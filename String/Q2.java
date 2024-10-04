public class Q2 {
    /*
     * Given two strings which are of lengths n and n+1. The second string contains
     * all the character of the first string, but there is one extra character. Your
     * task to find the extra character in the second string.
     * 
     * Example 1:
     * 
     * Input:
     * s1 = abcd
     * s2 = badce
     * Output:
     * e
     */
    public static char extraChar(String s1, String s2) {

        // write your code here
        int arr[] = new int[26];
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            arr[s1.charAt(i) - 'a']--;
            arr[s2.charAt(i) - 'a']++;
        }
        arr[s2.charAt(n) - 'a']++;
        for (int i = 1; i < 26; i++) {
            if (arr[i] == 1) {
                return (char) (i + 'a');
            }
        }

        return '1';
    }
}
