// Search an element in an  array .
// if target element found then return it's index otherwise return -1 .

import java.util.*;
public class Linear_Searching{
 public static void main(String[] args){
   int[] arr = { 2, 4,67,98,45,32,56};
   int target = 56;
   LinearSearch(arr,target);
   }
  public staic void LinearSearch(int[] arr,int target){
    for(int i = 0; i < arr.length ; i ++){
    if(arr[i]==target){
      return i;
    }
      return -1;
  }
}
