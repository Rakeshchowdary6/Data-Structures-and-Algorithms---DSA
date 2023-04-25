package DSA_Practise.Binarysearchproblems;

public class searchinsertpos {
    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        int ans = searchInsert(a, 2);
        System.out.println(ans);
    }
        public static int searchInsert(int[] nums, int target) {
             int low =0;
             int high = nums.length-1;
    
             while(low<=high){
                 int mid = low + (high - low)/2;
                 if(nums[mid]<target){
                     low = mid+1;
                 }else {
                     high = mid-1;
                 }
                 if(nums[mid]== target){
                     return mid;
                 }
             }
             return low;
             }
        }
