import java.util.Arrays;

//package Arrays.Sorting.1.Selection Sort;

public class Insertion_Sort {
    public static void main(String[] args){
        int[] arr = {2,6,94,32,4,9,45,1};
        Sorting2(arr);
        System.out.println(Arrays.toString(arr));

    }
    
 // Insertion Sort
 public static void Sorting2(int[] arr){
     int key , j;
    for(int i = 1; i < arr.length ; i++){
        key= arr[i];
        j = i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]= arr[j];
            j = j - 1;
    
        }
        arr[j+1] = key;
    }
 }

    
}
