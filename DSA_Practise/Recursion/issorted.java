package DSA_Practise.Recursion;

public class issorted {
    public static void main(String[] args) {
        int[] a = {1,2,6,4};
        System.out.println(issortedornot(a));
    }
    static boolean issortedornot(int[] arr){
        return helper(arr,0);
    }
    static boolean helper(int[] arr, int index) {
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && helper(arr, index+1);
    }
}
