/*
Given an unsorted array of integers, find the number of continuous subarrays having sum exactly equal to a given number k.

Example : 
  Input:
  N = 5
  Arr = {10 , 2, -2, -20, 10}
  k = -10
  Output: 3
  Explaination: 
  Subarrays: arr[0...3], arr[1...4], arr[3..4]
  have sum exactly equal to -10.
*/


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
        //Method -1  :  number of subarrays sum exactly equal k
        // Time complexity -  O(N^2)
        // Space :  O(1)
        public static int NoOfSubarray1(int[] arr,int n,int k ){
                int count =0;
                for(int i=0;i<n;i++){
                        int sum=0;
                        for(int j=i;j<n;j++){
                                sum+=arr[j];

                                if(sum==k){
                                        count++; 
                                }       
                        }
                }
                return count;
        }

        /* Method -2  :  number of subarrays sum exactly equal k
        efficient Solution- (Using HashMap)
        // Time complexity -  O(n)
        // Space :  O(n)

   */
        public static int NoOfSubarray2(int[] arr,int n,int k ){
                int ans=0;
                HashMap<Integer,Integer> map = new HashMap<>();
                map.put(0,1);
                int sum =0;
                for(int i=0;i<n;i++){
                        sum+=arr[i];

                        int remove = sum-k;

                        if(map.containsKey(remove))
                                ans+=map.get(remove);

                        map.put(sum , map.getOrDefault(sum,0)+1);
                }
                return ans;
        }
        
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr= new int[n];
                for(int i =0;i<n;i++){
                        arr[i]=sc.nextInt();
                }
                int k = sc.nextInt();

                int ans = NoOfSubarray2(arr,n,k);
                System.out.println(ans);
	}
}
