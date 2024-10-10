import java.util.ArrayList;

public class Q5 {
    /*
     * Given an ArrayList arr, check if it is sorted or not. It should be in sorted
     * ascending or descending order.
     * 
     * Example 1:
     * 
     * Input:
     * arr = {1, 3, 56, 99}
     * Output:
     * Sorted
     * Explanation:
     * The given arraylist is sorted in ascending
     * order.
     * 
     * 
     * Example 1:
     * 
     * Input:
     * arr = {13, 12, 11, 11}
     * Output:
     * Sorted
     * Explanation:
     * The given arraylist is sorted in descending
     * order.
     */
    public static boolean isSorted(ArrayList<Integer> numbers) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > numbers.get(i - 1)) {
                descending = false;
            } else if (numbers.get(i) < numbers.get(i - 1)) {
                ascending = false;
            }
        }

        return ascending || descending;
    }
}
