package DSA_Practise.Recursion;

public class linearsearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,59,43,22};
        System.out.println(search(array, 4,0));
        System.out.println(search(array, 4,array.length-1));
    }
    static int search(int[] arr,int target,int index){
        return helper(arr,target,0);
        
    }

    static int helper(int[] arr,int target , int index){
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;//helper(arr, target, index);
        }
        return helper(arr, target, index+1);
    }
}
