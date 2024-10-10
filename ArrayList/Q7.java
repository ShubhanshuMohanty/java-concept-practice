import java.util.*;

public class Q7 {
    /*
     * Given an array arr of size n. Return all the elements which are less than to
     * given element x. Your task is to return an ArrayList to the given function
     * getSmaller() having all smaller elements.
     * 
     * Example 1:
     * 
     * Input:
     * n = 5
     * arr = [54, 43, 2, 1, 5]
     * x = 7
     * Output:
     * 2 1 5
     * Explanation: 2, 1, 5 are smaller than 7.
     */

    public static ArrayList<Integer> getSmaller(int arr[], int x) {

        // write your code here
        // return an arraylist with elements smaller than x
        // maintain the order while traversing
        ArrayList<Integer> sm = new ArrayList<Integer>();
        for (int i : arr) {
            if (i < x) {
                sm.add(i);
            }
        }
        return sm;

    }
}
