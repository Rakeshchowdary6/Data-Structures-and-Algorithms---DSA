package DSA_Practise.Sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class cyclicone{
    public static void main(String[] args) {
        int[] arr = {1,2,2,0,1,0};
        System.out.println(Arrays.toString(cyclicsortt(arr)));
    }
    static int[] cyclicsortt(int[] arr){
        for(int i=0;i<arr.length;){
            if (arr[i] != i + 1) {
                int exactindex = arr[i];

            if( arr[i]!=arr[exactindex]){
                swapp(arr,i,exactindex);
            }else{
                i++;
            }
        }else{
            i++;
        }
        }
        return arr;
    }
    static void swapp(int[] arr, int i, int exactindex) {
        int temp = arr[i];
        arr[i] = arr[exactindex];
        arr[exactindex]= temp;
    }
}

public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println((sort(arr)));
        
    }
    static List<Integer> sort(int[] arr){
        
        for(int i=0;i<arr.length;){
            int correctindex = arr[i]-1;
            if(arr[i]!=arr[correctindex]){
                swap(arr,i,correctindex);
                //correctindex = arr[i]-1;
            }else{
                i++;
            }
        }
        List<Integer> li = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
    if(arr[i]!=i+1){
        li.add(arr[i]);
    }
    }
    return li;
    }
    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}


class leetcodeques{
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,8};
        int ans = missing(arr);
        System.out.println((ans));
        
    }
    static int missing(int[] arr){
    for(int i=0;i<arr.length;){
        int correctindex = arr[i];
        if(arr[i]>0 && arr[i]!=arr[correctindex]){
            swap(arr,i,correctindex);
         }else{
            i++;
        }
    }
    for(int i=0;i<arr.length;i++){
    if(arr[i]!=i){
        return i;
    }
    }
    return arr.length;
    
    
}
static void swap(int[] arr, int first, int last) {
    int temp = arr[first];
    arr[first] = arr[last];
    arr[last] = temp;
}
}




class leetcode {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(arr));
    }
    static public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     list.add(i);
        // }
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=i && !list.contains(i)){
        //         list.add(i);
        //     }
        // }
        // return list;

        for(int i=0;i<arr.length;){
        int correctindex = arr[i]-1;
        if( arr[i]!=arr[correctindex]){
            swap(arr,i,correctindex);
        }else{
            i++;
        }
    }
    for(int i=0;i<arr.length;i++){
    if(arr[i]!=i+1){
        list.add(i+1);
    }
    }
    return list;
    
    
    }
    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}



class Solutionsss {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] nums) {
     boolean vis[] = new boolean[nums.length];
     for(int i = 0 ; i< nums.length ; i++){
         if(vis[nums[i]] == true){
             return nums[i];
         }
         vis[nums[i]] = true;
     }
     return 0;   
    }
}


class Solutionnnn {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] nums) {
        for(int x: nums){
            if(x < 0){
                x*=(-1);
            }
            if(nums[x] < 0){
                return x;
            }
            nums[x] *= (-1);
        }
        return -1;
    }
}


class revcyclic{
    public static void main(String[] args) {
         int[] array = {0,2,1,1,2,0,1,2,0};
         System.out.println(Arrays.toString(cyclicc(array)));
    }
    static int[] cyclicc(int[] arr){
          for(int i=0;i<arr.length;){
            int correctind = arr[i]-1;
            if(arr[i]!=arr[correctind]){
                swap(arr,i,correctind);
            }else{
                i++;
            }
          }
          return arr;
    }
     static void swap(int[] arr, int i, int correctind) {
        int temp = arr[i];;;
        arr[i]=arr[correctind];
        arr[correctind]=temp;
    }
}