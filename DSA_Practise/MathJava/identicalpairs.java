package DSA_Practise.MathJava;

public class identicalpairs {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,3};
        int a = numIdenticalPairs(arr);
        System.out.println(a);
    }
    static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] temp = new int[101];
        
        for (int i = 0; i < nums.length; i++) {
            ans += temp[nums[i]]++;
        }
        return ans;
    }
}

