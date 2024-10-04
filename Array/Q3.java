import java.util.*;
public class Q3 {
    /*
     * Given an array arr[], check whether it is sorted in non-decreasing order.
     * Return true if it is sorted otherwise false.
     * 
     * Examples:
     * 
     * Input: arr[] = [10, 20, 30, 40, 50]
     * Output: true
     * Explanation: The given array is sorted.
     * Input: arr[] = [90, 80, 100, 70, 40, 30]
     * Output: false
     * Explanation: The given array is not sorted.
     */

     public boolean arraySortedOrNot(List<Integer> arr) {
        // code here
        for(int i=1;i<arr.size();i++)
        {
            if(!(arr.get(i-1)<arr.get(i)))
            {
                return false;
            }
            
        }
        return true;
    }
}
