package DSA_Practise.Binarysearchproblems;

public class pivotinrotatedsorted {
    public static void main(String[] args) {
        int[] arr = {7,0,1,2,3};
        int ans = search(arr, 3);
        System.out.println(ans);
        
    }
    static int search(int[] arr,int target){
        int pivot = findingpivot(arr);
        int firstasc = binarysearch1(arr, target, 0,pivot );

        if(firstasc != -1){
            return binarysearch1(arr, target, 0,pivot );
       }
       return binarysearch1(arr, target, pivot+1, arr.length-1);
    }

    static int findingpivot(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }else{
                low = mid -1;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    static int binarysearch1(int[] arr , int target,int low,int high){
        

        while(low<=high){
        int mid = (low + high)/2;
        if(arr[mid]<target){
            low = mid +1;
        }else{
            high = mid - 1;
        }
        if(arr[mid] == target){
            return mid;
        }
    }
    return -1;
    }
}
