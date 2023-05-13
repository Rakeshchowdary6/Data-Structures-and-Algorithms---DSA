package DSA_Practise.Binarysearchproblems;

public class validmountain {
    public static void main(String[] args) {
        int[]  a = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(validMountainArray(a));
    }
        public static boolean validMountainArray(int[] arr) {
             int peak = binarysearch(arr);
             boolean ascending = search(arr,0,peak);
             
                 boolean descending = search1(arr,peak,arr.length-1);
             
             if(ascending && descending){
                 return true;
             }else{
                 return false;
             }
        }
        private static boolean search1(int[] arr, int peak, int k) {
            for(int i=peak;i<k;i++){
                if(arr[i]<=arr[i+1]){
                    return false;
                }
            }
            return true;
        }
        public static boolean search(int[] arr,int m,int n){
            for(int i=m;i<n;i++){
                if(arr[i]>=arr[i+1]){
                    return false;
                }
            }
            return true;
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
            return low; //{arr[high]};
        }
    }

