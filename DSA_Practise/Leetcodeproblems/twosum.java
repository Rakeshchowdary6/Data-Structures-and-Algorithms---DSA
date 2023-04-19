package DSA_Practise.Leetcodeproblems;

//package DSA_Practise.Leetcodeproblems;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twwss(arr, 6)));
    }
    static int[] twwss(int[]arr,int target){
    int start = 0;
       int end = arr.length-1;
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
        if(arr[start]+arr[end]==target){
            return new int[] {start,end};
        }
           if(arr[start]+arr[end]>target){
               end--;
           }else{
               start++;
           }
           
       }
       return new int[]{-1,-1};
    }
} 

