package DSA_Practise.Recursion;

public class bsusingrec {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,9};
        System.out.println(bsusingrecursion(arr, 0, arr.length-1, 9));
    }
    static int bsusingrecursion(int[] arr,int start,int end,int target){
        //  int start = 0;
        //  int end = arr.length-1;

         
            int mid = start + (end-start)/2;
             if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]>target){
               return bsusingrecursion(arr, start, mid-1, target);
            }
            return bsusingrecursion(arr, mid+1, end, target);
    }
}
