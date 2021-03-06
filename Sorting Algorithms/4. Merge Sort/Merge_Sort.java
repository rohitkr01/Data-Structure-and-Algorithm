import java.util.Arrays;

public class Merge_Sort {
    public static void merge_Sort(int[] arr, int start , int end){
        if(start < end){
            int mid = start + (end - start)/2;

            // sort for first and second Halves
            merge_Sort(arr,start,mid);
            merge_Sort(arr, mid + 1, end);

            // merge the two sorted subarray
            merge(arr,start,mid,end);

        }

    }
    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void main(String args[]){
        int[] arr = {65,43,78,2,9,4,53,18};
        int start = 0 ; 
        int end = arr.length - 1 ;

        merge_Sort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
    
}
