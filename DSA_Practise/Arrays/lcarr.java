package DSA_Practise.Arrays;

import java.util.HashMap;
import java.util.Map;

public class lcarr {
    public static void main(String[] args) {
        int[] a = {-2,0,10,-19,4,6,-8};
        boolean ans = checkIfExist(a);
        System.out.println(ans);
    }
    public static boolean checkIfExist(int[] arr) {
        Map<Integer,Integer> mpp = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            mpp.put(arr[i],1);
        }
        
        // for (Map.Entry<Integer,Integer> entry : mpp.entrySet()) {
        //         if(mpp.containsValue(entry.getValue()*2)){
        //     //if(entry.getValue()*2 == mpp.get(entry.getValue()*2)){
        //              return true;
        //          }
        // }
        for(int i=0;i<arr.length;i++){
        if(mpp.containsKey(arr[i]*2)){
            return true;
        }
        }
        return false;
    }
}
