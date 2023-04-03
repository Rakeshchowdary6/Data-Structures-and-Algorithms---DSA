package DSA_Practise.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class unionandinter {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,3,2,5,6,};
        int[] arr2 = {2,2,2};

        // Set<Integer> ts = new TreeSet<>();

        // for(int i=0;i<arr1.length;i++){
        //     ts.add(arr1[i]);
        // }
        // for(int i=0;i<arr2.length;i++){
        //     ts.add(arr2[i]);
        // }
         
        //System.out.println(ts);
        List<Integer> l = new ArrayList<>();

        if(arr1.length>arr2.length){
            int m=0 , n=0;
            for(int i=0;i<arr1.length;i++){
                if(arr1[m]>arr2[n]){
                    l.add(arr2[n]);
                }
            }
        }
    }

}
