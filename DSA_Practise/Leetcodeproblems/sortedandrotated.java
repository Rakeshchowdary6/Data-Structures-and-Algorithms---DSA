package DSA_Practise.Leetcodeproblems;

public class sortedandrotated {
    public static void main(String[] args) {
        int[] arr = {3};
        System.out.println(check(arr));
      //  check(arr);
    }
        static boolean check(int[] nums) {
            int count = 0;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                    count++;
                } 
                       
            }
            if(count==0){
                return true;
            } 
            if(nums[0]>=nums[nums.length-1] && count<=1){
                return true;
            }
            
            return false;
        }
    }

