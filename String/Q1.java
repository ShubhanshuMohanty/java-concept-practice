class Q1 {
    /*
     * You are given a string s. You need to find if the string is a panagram or
     * not.
     * A panagram contains all the letters of english alphabet at least once.
     * 
     * Example 1:
     * 
     * Input:
     * s = Thequickbrownfoxjumpsoverthelazydog
     * Output: 1
     */
    public static boolean isPanagram(String str) {
        // Check if given string is panagram
        if (str.length() < 26) {
            return false;
        }
        boolean visited[] = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x >= 'a' && x <= 'z') {
                visited[x - 'a'] = true;
            }
            if (x >= 'A' && x <= 'Z') {
                visited[x - 'A'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;

    }
}