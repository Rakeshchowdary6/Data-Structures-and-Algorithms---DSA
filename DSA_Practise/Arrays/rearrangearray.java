package DSA_Practise.Arrays;

import java.util.Arrays;

public class rearrangearray {
    public static void main(String[] args) {
        int[] a = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(a)));
    }
    public static int[] rearrangeArray(int[] nums) {
        
        int n = nums.length;
    int posindex = 0;
        int negindex = 1;

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                swap(nums,i,posindex);
                posindex+=2;
            }else{
                swap(nums,i,negindex);
                negindex+=2;
            }
        }
        return nums;
    }

    public static void swap(int[] arr,int startindex,int end){
        int temp = arr[startindex];
        arr[startindex]=arr[end];
        arr[end]=temp;
    }
}

