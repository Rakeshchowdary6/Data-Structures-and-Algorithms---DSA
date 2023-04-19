package DSA_Practise.Arrays;

import java.util.HashMap;
import java.util.Map;

class maxsubarrayofmultiplek{
    public static void main(String[] args) {
        int[] arr = {5,0,0,0};
        System.out.println(checkSubarraySum(arr, 3));
    }
public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) {
                sum = sum % k;
            }
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1) {
                    return true;
                }
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }
}
