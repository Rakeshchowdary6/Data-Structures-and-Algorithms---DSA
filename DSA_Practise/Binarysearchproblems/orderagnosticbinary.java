package DSA_Practise.Binarysearchproblems;

public class orderagnosticbinary {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        int ans = orderagnosticbinarysearch(array, 2);
        System.out.println(ans);
    }
    


static int orderagnosticbinarysearch(int[] arr , int target){
    int low = 0;
    int n = arr.length;
    int high = n - 1;

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
    }
    else
    {
        if(arr[mid]>target){
        low = mid +1;
    }
    else
    {
        high = mid - 1;
    }
    }
}
return -1;
}
}

