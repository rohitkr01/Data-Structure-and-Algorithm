import java.util.Arrays;
public class Selection_Sort{
    public static void main(String args[]){
        int[] arr = { 36,65,75,27,34,17,28,12,2};

        System.out.println(Arrays.toString(arr));
        Sel_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
     //Selection Sort
    public static void Sel_Sort(int[] arr){
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < arr.length-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++)
               {
                    if (arr[j] < arr[min_idx])
                    min_idx = j;
                }
            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

    }   


}
