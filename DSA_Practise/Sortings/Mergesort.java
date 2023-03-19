package DSA_Practise.Sortings;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] a = {8,10,5,2,6,4,3,1,9,7};
        int[] ans = (mergeSort(a));
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergeSort(int[] arr){

        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] first = new int[mid];
        int[] second = new int[arr.length-mid];

        for(int i=0;i<first.length;i++){
            first[i]=arr[i];
        }
        for(int j=mid;j<arr.length;j++){
            second[j-mid]=arr[j];
        }
        mergeSort(first);
        mergeSort(second);
        return merge(arr,first,second);
    }
    static int[] merge(int[] arr,int[] first,int[] second) {
        int leftindex = 0;
        int rightindex  =0;
        int newarrindex = 0;

        while(leftindex<first.length && rightindex < second.length){
            if(first[leftindex]>second[rightindex]){
                arr[newarrindex] = second[rightindex];
                rightindex++;
            }else{
                arr[newarrindex] = first[leftindex];
                leftindex++;
            }
            newarrindex++;
        }

        while(leftindex<first.length){
            arr[newarrindex]=first[leftindex];
            leftindex++;
            newarrindex++;
        }
        while(rightindex<second.length){
            arr[newarrindex]=second[rightindex];
            rightindex++;
            newarrindex++;
        }
        return arr;
    }

    
}
