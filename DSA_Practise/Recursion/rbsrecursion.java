package DSA_Practise.Recursion;

public class rbsrecursion {
    public static void main(String[] args) {
        int[] a = {5,6,7,8,1,2,3,4};
        System.out.println(search(a, 4, 0, a.length-1));
    }
    static int search(int[] arr,int target,int start,int end){
        int mid = start + (end - start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                return search(arr, target, start, mid-1);
            }else{
                return search(arr, target, mid+1, end);
            }
        }

        if(target>=arr[mid] && target<=arr[end]){
            return search(arr, target, mid+1, end);
        }else{
            return search(arr, target, start, mid-1);
        }
    }
}
