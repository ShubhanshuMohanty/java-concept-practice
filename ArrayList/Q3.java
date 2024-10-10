import java.util.ArrayList;

public class Q3 {
    /*
     * You are given an ArrayList numbers that contains integers. You need to count
     * distinct integers in the ArrayList.
     * 
     * Example 1:
     * 
     * Input:
     * numbers = [4, 4, 5, 4, 3, 8, 4, 2, 4, 8, 1, 7]
     * Output:
     * 7
     * Explanation: The distinct list would be
     * [4, 5, 3, 8, 2, 1, 7]. The length is 7.
     */
    public static int countDistinct(ArrayList<Integer> numbers) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int n : numbers) {
            if (!num.contains(n)) {
                num.add(n);
            }
        }
        return num.size();
    }

}
