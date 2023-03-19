package DSA_Practise.Sortings;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,1,3,2};
        int[] ans = selsort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] selsort(int[] arr){
         for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = maxofarray(arr,0,last);
            swap(arr, maxIndex, last);

         }
         return arr;

        
    }
    static void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    static int maxofarray(int[] arr,int start,int last){
        int max = start;
        //Arrays.sort(arr);
        for(int i=start;i<=last;i++){
            if(arr[i]>arr[max]){
                max=i;
              //  last--;
            }
        }
        return max;
    }
}




class selsorttwo{
    public static void main(String[] args) {
        int[] arr = {2,2,2,1,2,1,2,1,2,1,2,1,2};
        //System.out.println(minIndex(arr));
        System.out.println(Arrays.toString(selsortusingminindex(arr)));
    }
    static int[] selsortusingminindex(int[]arr){
        for(int i=0;i<arr.length;i++){
            int begin = i;
            int minindex = minIndex(arr,begin,arr.length-1);
            swapping(arr, i, minindex);
        }
        return arr;
    }
    static void swapping(int[] arr , int first,int last){
       // if(first!=last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }


    static int minIndex(int[] arr,int begin,int end ){
        int min = begin;
        for(int i=begin;i<=end;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        return min;
    }
}