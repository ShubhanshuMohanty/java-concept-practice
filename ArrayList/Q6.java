import java.util.*;
public class Q6 {
    /*
     * You are given a ArrayList numbers that contains integers. You need to return
     * ArrayList of two ArrayLists, one of even numbers and other of odd numbers.
     * 
     * Example 1:
     * 
     * Input:
     * numbers = [54, 43, 2, 5, 14, 17, 18, 9]
     * Output:
     * even: 54 2 14 18
     * odd: 43 5 17 19
     * 
     */
    public static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> numbers) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i : numbers) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }

        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        arr.add(even);
        arr.add(odd);

        return arr;
    }
}
