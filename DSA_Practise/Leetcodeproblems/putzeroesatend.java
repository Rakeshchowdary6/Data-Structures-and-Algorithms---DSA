package DSA_Practise.Leetcodeproblems;

import java.util.Arrays;

public class putzeroesatend {
    public static void main(String[] args) {
        
    }
        public void moveZeroes(int[] nums) {
            for(int i=0;i<nums.length;i++){
                int begin = i;
                int minindex = minIndex(nums,begin,nums.length-1);
                if(nums[i]==0){
                swapping(nums, i, minindex);
            }
        }
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
    
    class lccc{
        public static void main(String[] args) {
            int[] arr = {4,2,4,0,0,3,0,5,1,0};
           // moveZeroes(arr);
           System.out.println(Arrays.toString(moveZeroes(arr)));
        }
    
    
    static int[] moveZeroes(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int j = i + 1;
                int firstNonZeroIndex = -1;
                int firstNonZero = Integer.MAX_VALUE;
                while (j < n) {
                    if (nums[j] != 0 && nums[j] < firstNonZero) {
                        firstNonZeroIndex = j;
                        firstNonZero = nums[j];
                    }else{
                    j++;
                }
            
                if (firstNonZeroIndex != -1) {
                    nums[i] = nums[firstNonZeroIndex];
                    nums[firstNonZeroIndex] = 0;
                } else {
                    break;
                }
            }
        }
        }
        return nums;
    }
}
    