public class DeleteAndShift {
    // Array Delete And Shift
    public static void deleteFromArray(int arr[], int n, int index) {
        for (int j = index; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[n - 1] = 0;
    }
}
