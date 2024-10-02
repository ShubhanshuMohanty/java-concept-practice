public class Q2 {
    /*
     * You are given an array numbers that contains integers. You need to return one
     * array of the same length, first filled with even numbers and then by odd
     * numbers.
     * 
     * Example 1:
     * 
     * Input:
     * numbers = [54, 43, 2, 5, 14, 17, 18, 19]
     * Output:
     * 54 2 14 18 43 5 17 1
     */
    public static int[] evenOdd(int[] numbers){

        //write your code here
        int track=0;
        int arr[]=new int[numbers.length];
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]%2==0)
            {
                arr[track]=numbers[i];
                track++;
            }
        }
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]%2!=0)
            {
                arr[track]=numbers[i];
                track++;
            }
        }
        //return required array
        return arr;
    
    }
}
