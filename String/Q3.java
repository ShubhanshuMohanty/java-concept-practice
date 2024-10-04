public class Q3 {
    /*
     * Given two strings a and b consisting of lowercase characters. The task is to
     * check whether two given strings are an anagram of each other or not. An
     * anagram of a string is another string that contains the same characters, only
     * the order of characters can be different. For example, act and tac are an
     * anagram of each other. Strings a and b can only contain lowercase alphabets.
     * 
     * Input:a = geeksforgeeks, b = forgeeksgeeks
     * Output: YES
     * Explanation: Both the string have same characters with same frequency. So,
     * they are anagrams.
     */
    public static boolean isAnagram(String a, String b) {

        // Your code here
        if(a.length()!=b.length())
        {
            return false;
        }
        int count[]=new int[26];
        int s=a.length();
        for(int i=0;i<s;i++)
        {
            count[a.charAt(i)-'a']++;
            count[b.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
