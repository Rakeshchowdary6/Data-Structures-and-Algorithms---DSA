package DSA_Practise.Binarysearchproblems;

public class searchinmountainarray {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,4,3,2,1};
        int ans = search(arr, 1);
        System.out.println(ans);
    }
        static int search(int[]arr , int target){
        int peak = findingpeakelelement(arr);
        int searchinincreasearray = binarysearch1(arr, target,0,peak);
        if(searchinincreasearray != -1){
             return searchinincreasearray ;//= binarysearch1(arr, 3, peak+1, arr.length-1);
        }
        return binarysearch1(arr, target, peak+1, arr.length-1);
    }


static int binarysearch1(int[] arr , int target,int low , int high){
    // int low = 0;
    // int n = arr.length;
    // int high = n - 1;

    boolean isAsc;
    if(arr[low]<arr[high]){
        isAsc = true;
    }else{
        isAsc = false;
    }

    while(low<=high){
    int mid = (low + high)/2;
    if(arr[mid] == target){
        return mid;
    }
    if(isAsc==true){
    if(arr[mid]<target){
        low = mid +1;
    }else{
        high = mid - 1;
    }
    }else if(arr[mid]>target){
        low = mid +1;
    }else{
        high = mid - 1;
    }
    }
return -1;
}



static int findingpeakelelement(int[] arr){
    int low =0;
    int high = arr.length-1;

    while(low!=high){
        int mid = low + (high-low)/2;
        //  if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
        //      return arr[mid];
        //  }

        if(arr[mid]>arr[mid+1]){
            high = mid;
        }else{
            low=mid+1;
        }
    }
    return low; //{arr[high]};
}
}

