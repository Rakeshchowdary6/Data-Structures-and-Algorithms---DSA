package DSA_Practise.Leetcodeproblems;

import java.util.Arrays;

public class Reversesubarrofksize {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int k = 3;
        System.out.println(Arrays.toString(revksize(a, k)));
    }
    static int[] revksize(int[] arr,int k){
        for(int i=0;i<arr.length;i=i+k){

            int start = i;
            int end = Math.min(i+k-1, arr.length-1);

            // while(start<=end){
            //     int temp = arr[start];
            //     arr[start]=arr[end];
            //     arr[end]=temp;
            //     start++;
            //     end--;
            // }

            reverse(arr,start,end);
        }
        return arr;
    }
     static int[] reverse(int[] arr, int start, int end) {
        for(int i=start;i<=start+(end-start)/2;i++){
              int temp = arr[i];
              arr[i] = arr[end-i+start];
              arr[end-i+start] = temp;
        }
        return arr;
    }
    // return arr;

//}
}

