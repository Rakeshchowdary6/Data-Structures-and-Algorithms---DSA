package DSA_Practise.Binarysearchproblems;


public class binarysearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int ans = binarysearch1(array, 7);
        System.out.println(ans);

    }
    static int binarysearch1(int[] arr , int target){
        int low = 0;
        int n = arr.length;
        int high = n - 1;

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




class binarysearch11 {
    public static void main(String[] args) {
        int[] array = {1,2,11,14,16,17};
        int ans = binarysearch1(array, 18);
        System.out.println(ans);

    }
    static int binarysearch1(int[] arr , int target){
        int low = 0;
        int n = arr.length;
        int high = n - 1;

        while(low<=high){
        int mid = (low + high)/2;
        if(arr[mid]<target){
            low = mid +1;
        }else if(arr[mid]>target){
            high = mid - 1;
        }
        if(arr[mid] == target){
            return arr[mid];
        }
    }
    int ans = arr[high];
    return ans;
    }
}



class binarysearchchars {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','e','g','h'};
        char ans = nextGreatestLetter(arr, 'e');
        System.out.println(ans);
        System.out.println(4%6);
    }
    static char nextGreatestLetter(char[] arr, char target) {
        int low = 0;
        int n = arr.length;
        int high = n - 1;

        while(low<=high){
        int mid = (low + high)/2;
        if(arr[mid]>target){
            high = mid - 1;
        }else{
            low = mid + 1;
            }
    }
    return arr[low%n];   
}
}




class leetcodesqrt {
    public static void main(String[] args) {
        int ans = mySqrt(22);
        System.out.println(ans);
    }
    static int mySqrt(int x) {
        int low =0;
        int high = x;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(x/mid<mid){
                high=mid-1;
            }else if(x/mid>mid){
                low=mid+1;
            }
            if(x/mid==mid){
                 return mid;
            }
        }
        return high;
    }
}