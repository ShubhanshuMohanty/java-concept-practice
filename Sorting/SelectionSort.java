public class SelectionSort {
    static void selectionSort(int[] arr,int n)
    {
        int mid_ind=0;
        for(int i=0;i<n;i++)
        {
            mid_ind=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[mid_ind])
                {
                    mid_ind=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mid_ind];
            arr[mid_ind]=temp;
        }
        
    }
}
