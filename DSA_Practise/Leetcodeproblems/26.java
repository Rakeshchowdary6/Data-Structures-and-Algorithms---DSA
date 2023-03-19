package DSA_Practise.Leetcodeproblems;

import java.util.Arrays;

class ddd {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,3,3,3};
        System.out.println((Arrays.toString(removeDuplicates(arr))));
    }
        static public int[] removeDuplicates(int[] nums) {
            int j=1;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]!=nums[i+1]){
                      nums[j]=nums[i+1];
                      j++;
                }
            }
            return nums;
        }
    }

class hhss{
    public static void main(String[] args) {
        int[]nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            int idx = index[i];
            int val = nums[i];
            // insert val at index idx in target
            for (int j = n - 1; j > idx; j--) {
                target[j] = target[j - 1];
            }
            target[idx] = val;
        }
        return target;
    }
}
    