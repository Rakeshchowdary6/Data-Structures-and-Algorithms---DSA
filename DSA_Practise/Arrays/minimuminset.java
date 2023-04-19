package DSA_Practise.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class minimuminset {
    public static void main(String[] args) {
        int[] num1 = {4,5};
        int[] num2 = {2,4};
        int ans = minNumber(num1, num2);
        System.out.println(ans);
    }
       static public int minNumber(int[] nums1, int[] nums2) {
            int n1 = nums1.length;
            int n2 = nums2.length;
    
            Set<Integer> set;

            if(n1>n2){
            set = new HashSet<Integer>(Arrays.asList(toIntegerarray(nums1)));
            }else{
             set = new HashSet<Integer>(Arrays.asList(toIntegerarray(nums2)));
            }
    
            if(n1>n2){
                for(int i : nums2){
                    if(set.contains(i)){
                        return i;
                    }
                }
            }
            else{
                for(int i: nums1){
                        if(set.contains(i)){
                            return i;
                        }
                    }
                }
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            for(int i=0;i<nums1.length;i++){
                if(nums1[i]<min1){
                    min1=nums1[i];
                }
            }
            
            for(int i=0;i<nums2.length;i++){
                if(nums2[i]<min2){
                    min2=nums2[i];
                }
            }
    
            return (min1*10)+min2;
        }

        static private Integer[] toIntegerarray(int[] arrray) {

            Integer[] a = new Integer[arrray.length];
            for(int i=0;i<arrray.length;i++){
                     a[i] = arrray[i];
            }
            return a;
        }
    }

