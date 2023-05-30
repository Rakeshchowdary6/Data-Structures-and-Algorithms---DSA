package DSA_Practise.Arrays;

public class arraylcprblm {
    public static void main(String[] args) {
        int[] a = {5,3,6,1,12};
        
        int ans = findFinalValue(a, 3);
        System.out.println(ans);
    }
        public static int findFinalValue(int[] nums, int original) {
            //Arrays.sort(nums);
            for(int i=0;i<nums.length;i++){
                if(nums[i]==original){
                    //original = nums[i] * 2;
                    return findFinalValue(nums,original*2);
    
                }
            }
            return original;
        }
    }

