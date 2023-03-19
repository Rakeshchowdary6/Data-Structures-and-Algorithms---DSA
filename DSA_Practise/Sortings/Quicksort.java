package DSA_Practise.Sortings;

// import java.util.Arrays;

// public class Quicksort {
//     public static void main(String[] args) {
//         int[] arr = {5,7,8,9,1,2,6,4,3};
//         quick(arr, 0,8);
//         System.out.println(Arrays.toString(arr));
//     }
//     static void quick(int[] arr,int lo,int hi){
//         if(lo>=hi){
//             return;
//         }
//             int s =0;
//             int e = hi;
//             int mid = s + (e-s)/2;
//             int pivot = arr[mid];
//         while(s<=e){
//             while(arr[s]<pivot){
//                 s++;
//             }
//             while(arr[e]>pivot){
//                 e--;
//             }
//             if(s<=e){
//                 int temp = arr[s];
//                 arr[s]=arr[e];
//                 arr[e]=temp;
//                 s++;
//                 e--;
//             }
//         }
//             quick(arr, lo, e);
//             quick(arr, s, hi);
//         }
//     }





    import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0,1,2,1};
        quick(arr, 0, 6);
        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        
        int s = lo;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];
        
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        
        quick(arr, lo, e);
        quick(arr, s, hi);
    }
}
