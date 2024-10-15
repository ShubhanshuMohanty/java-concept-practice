public class RotateArray {
    /*
     * Input: arr[] = [1, 2, 3, 4, 5], d = 2
     * Output: [3, 4, 5, 1, 2]
     * Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
     */
    static void rotateArr(int arr[], int d) {
        // add your code here
        if (arr.length == 1 || d == 0) {
            return; 
        }
        d = d % arr.length;
        rev(arr,0,d-1);
        rev(arr,d,arr.length-1);
        rev(arr,0,arr.length-1);
    }
    static void rev(int arr[],int low,int high)
    {
        while(low<high)
        {
            arr[low]=arr[low]+arr[high];
            arr[high]=arr[low]-arr[high];
            arr[low]=arr[low]-arr[high];
            low++;
            high--;
        }
    }
}
