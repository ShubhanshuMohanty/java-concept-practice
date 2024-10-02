public class PracticeQ {
    /*
     * You are given a number k and a array numbers that contains integers. You need
     * to return array of numbers that are less than k.
     * 
     * Example 1:
     * 
     * Input:
     * numbers = [54, 43, 2, 1, 5]
     * k = 6
     * Output:
     * 2 1 5
     * Explanation: 2 1 5 are less than 6.
     */
    public static int[] lessThan(int[] numbers, int k) {

        // write your code here
        int flag = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < k) {
                flag++;
            }
        }
        int arr[] = new int[flag];
        int j = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < k) {
                j++;
                arr[j] = numbers[i];
            }
        }
        // return array with elements less than k
        return arr;

    }

}