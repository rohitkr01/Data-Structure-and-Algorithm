import java.util.Arrays;
public class Selection_Sort{
    public static void main(String args[]){
        int[] arr = { 36,65,75,27,34,17,28,12,2};

        System.out.println(Arrays.toString(arr));
        Bubble_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
     
   // Bubble Sort
    public static void Bubble_Sort(int[] arr){
        for(int i = 0; i< arr.length - 1 ; i++)
        {
            for(int j = 0  ; j < arr.length - 1 - i ; j++)
            {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }  

}
