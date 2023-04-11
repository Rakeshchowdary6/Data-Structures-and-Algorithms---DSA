package DSA_Practise.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class subarraysum{
    public static void main(String[] args) {
        int[] arr = {1,1,1,4,2,3};
        int m =3;
        System.out.println(subarraysumofk(arr, m));
    }
    static int subarraysumofk(int[] array ,int m){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;i<array.length;j++){
                 int sum =0;
                 for(int k=i;k<j;k++){
                     sum+= array[k];
                     
                 }
                 if(sum==m){
                    return j-i+1;
                 }
            }
        }
        return -1;
    }
    
}






class subarrays{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //System.out.println((subarraysofarray(arr)));
        List<int[]> subarrays = subarraysofarray(arr);
        for (int[] subarray : subarrays) {
            System.out.println(Arrays.toString(subarray));
        }


    }
    static List<int[]> subarraysofarray(int[] arr){
        List<int[]> list = new ArrayList<>();
         for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int[] subarray = Arrays.copyOfRange(arr, i, j+1);
                list.add(subarray);
            }
         }
         return list;
    }
}


class sbarrays{
    public static void main(String[] args) {
        int[] a = {1,2,3};
        //System.out.println(Arrays.toString(subarraysss(a)));
        List<List<Integer>> aa = subarraysss(a);
        for(List<Integer> ab : aa){
            System.out.println(ab);
        }
    }
    static List<List<Integer>> subarraysss(int[] ar){
        List<List<Integer>> mainlist = new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<=ar.length;j++){
                List<Integer> list = new ArrayList<>();
                for(int k=i;k<j;k++){
                    list.add(ar[k]);
                }
                mainlist.add(list);
            }
            
        }
        return mainlist;
    }
}


class Subarraysumm{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, -1, -2, 5, -4};
        System.out.println(subarraymaxlenght(a, 4));
    }
    static int subarraymaxlenght(int[] arr,int k){
        int maxlength = Integer.MAX_VALUE;
        int prefixsum =0;

        
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0, -1);
        for(int i=0;i<arr.length;i++){
            prefixsum+=arr[i];

            if(mpp.containsKey(prefixsum-k)){
                maxlength = Math.min(maxlength, i - mpp.get(prefixsum-k));
            }
            if(!mpp.containsValue(prefixsum)){
                mpp.put(prefixsum, i);
            } 
            }
            return maxlength;
        }
    }