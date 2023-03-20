import java.util.Arrays;

public class dnf {
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,1,2,0};
        System.out.println(Arrays.toString(dnfalgo(arr)));
    }
    static int[] dnfalgo(int[] arr){
        int low = 0;
        int high = arr.length-1;

        int mid = 0;
        while(mid<=high){
            //int mid = 0;
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
                //mid++;
            }
        }
        return arr;
    }
    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
