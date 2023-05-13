package DSA_Practise.Arrays;

import java.util.Arrays;

class Soluti{
    public static void main(String[] args) {
        int[] a = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(duplicateZeross(a)));
    }
    // public void duplicateZeros(int[] arr) {
    //     //int j =0;
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i]==0){
    //             arr[i+2]=arr[i+1];
    //             arr[i+1]=0;
    //             i=i+1;
    //         }
    //         if(i==arr.length-2){
    //             return;
    //         }
    //     }
    // }
    public static int[] duplicateZeros(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == 0){
                // shift the elements to right by 1
                for(int j=arr.length-2; j>i; j--){
                    arr[j+1] = arr[j];
                }
                arr[i+1] = 0;
                i=i+1; // increment i to skip the newly added zero
            }
        }
        return arr;
    }
    public static int[] duplicateZeross(int[] arr) {
        int countZeros = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                countZeros++;
            }
        }
        
        int n = arr.length + countZeros;
        int i = arr.length - 1, j = n - 1;
        
        while(i < j) {
            if(arr[i] != 0) {
                if(j < arr.length) {
                    arr[j] = arr[i];
                }
            } else {
                if(j < arr.length) {
                    arr[j] = arr[i];
                }
                j--;
                if(j < arr.length) {
                    arr[j] = arr[i];
                }
            }
            i--;
            j--;
        }
        return arr;
    }
}




class doubt{
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println(i);
            i=i+2;
        }
    }
}