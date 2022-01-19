## Binary Searching 

If there is given a sorted Array , and we hav an Target element .
Questionis that : if target element is exist in Array then return index of target element ,Otherwise return -1 .

Example : Given array Array = { 2,4,6,9,14,56,76}
          Target =  14
          Output : 4
          
  Algorithms for that -------
    BinarySearch(int[] Array , int target){
      int start =0;
      int end = Array.length - 1;
      
      while(start < end ){
          int mid = start - (end - start)/2;
          if(target < Array[mid]){
               end = mid - 1;
               }
           else if(target > Array[mid]){
                  start = mid + 1;
                  }
           else  
                return mid;
       }
       return -1;
     }
          
              
      
