package DSA_Practise.Leetcodeproblems;

import java.util.Arrays;

public class secondlargest {
    public static void main(String[] args) {
        int[] a = {12 ,35, 1, 10, 34, 1 };
        System.out.println(print2largest(a, a.length));
    }
      static  int print2largest(int arr[], int n) {
            // code here
            // Arrays.sort(arr);
            // for(int i=n-1;i>=1;i--){
            // if(arr[i]!=arr[i-1]){
            //     return arr[i-1];
            
            // }
            // }
            // return -1;
            // Arrays.sort(arr);
    
            // // Use binary search to find the index of the largest value
            // int largestIndex = Arrays.binarySearch(arr, arr[arr.length-1]);
    
            // // Iterate backwards from the largest value to find the second largest value
            // for (int i = largestIndex-1; i >= 0; i--) {
            //     if (arr[i] != arr[largestIndex]) {
            //         return arr[i];
            //     }
            // }
    
            // // Return -1 if no second largest value is found (i.e. all elements are equal)
            // return -1;
            int largest = arr[0];
            int secondlargest = -1;
            
            //Arrays.sort(arr);
            for(int i=0 ; i<n;i++){
               if(arr[i]>largest){
                   largest=arr[i];
               }
               }
            for(int i=0;i<n;i++){
                if(arr[i]>secondlargest && arr[i]!=largest){
                    secondlargest = arr[i];
                }
            }
            return secondlargest;
               
    }
    }
    
    
class larandsmal{
    public static void main(String[] args) {
        int[] a = {12,11,32,1,3,5,4};
        System.out.println(Arrays.toString(larandsm(a)));
    }
    static int[] larandsm(int[] arr){
        //int[] ans = new int[2];

        int slargest = secondlargest(arr);
        int smallest = secondsmallest(arr);

        return new int[] {slargest,smallest};
    }
    private static int secondsmallest(int[] arr) {
        
        int smallest = arr[0];
        int secondsmallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
               if(arr[i]<secondsmallest && arr[i]!=smallest){
                   secondsmallest=arr[i];
               }
        }
        System.out.println(smallest);
        return secondsmallest;
    }
    private static int secondlargest(int[] arr) {
        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                 largest=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        System.out.println(largest);
        return secondlargest;
    }
}



class sechigh{
    public static void main(String[] args) {
        int[] arr = {1,2,33,52,5,7,12};
        System.out.println(sechighh(arr));
    }
    static int sechighh(int[]arr){
        int largest = arr[0];
        int sechigh = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                //sechigh = largest;
                largest = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
             if(arr[i]>sechigh && largest!=arr[i]){
                sechigh = arr[i];
             }
        }
        return sechigh;
    }
}