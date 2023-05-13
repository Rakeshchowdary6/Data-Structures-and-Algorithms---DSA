package DSA_Practise.Binarysearchproblems;

class peakelement{
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,2,1};
        int ans = binarysearch(arr);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr){
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
        return arr[low]; //{arr[high]};
    }
}