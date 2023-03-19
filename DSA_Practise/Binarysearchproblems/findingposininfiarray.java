package DSA_Practise.Binarysearchproblems;

public class findingposininfiarray {

   public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
    int ans = rangeofarray(arr, 22);
    System.out.println(ans);
   }
    


static int rangeofarray(int[] arr,int target){
       int low =0;
       int end = 1;

       while(target>arr[end] && end<arr.length-1){
         int newstart = end;
         end = Math.min(end*2,arr.length-1);
         low = newstart;
       }
       //end = Math.min(end,arr.length-1);
       return binarysearch1(arr, target, low, end);
}


static int binarysearch1(int[] arr , int target,int low,int high){
    while(low<=high){
    int mid = (low + high)/2;
    if(arr[mid]<target){
        low = mid +1;
    }else{
        high = mid - 1;
    }
    if(arr[mid] == target){
        return mid;
    }
}
return -1;

}
}
