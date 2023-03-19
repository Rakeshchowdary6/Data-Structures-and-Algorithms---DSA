package DSA_Practise.Sortings;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1};
        System.out.println(Arrays.toString(insertionsorting(arr)));
    }

    static int[] insertionsorting(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
        return arr;
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}


class revinser{
    public static void main(String[] args) {
        int[] a = {3,4,2,1,5};
        System.out.println(Arrays.toString(insrev(a)));
    }
    static int[] insrev(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);;
                }
            }
        }
        return arr;
    }
    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}