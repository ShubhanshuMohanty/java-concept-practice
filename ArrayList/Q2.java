import java.util.ArrayList;

public class Q2 {
    /*
     * Given an array arr[] of size N containing integers. The task is to insert
     * elements of given array to an ArrayList and return that ArrayList.
     */
    public static ArrayList<Integer> fillArrayList(int arr[], int n) {
        // Your code here
        ArrayList<Integer> ar = new ArrayList<Integer>(n);
        for (int a : arr) {
            ar.add(a);
        }
        return ar;
    }
}
