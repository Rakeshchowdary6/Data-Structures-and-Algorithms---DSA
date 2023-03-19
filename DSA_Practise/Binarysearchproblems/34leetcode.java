package DSA_Practise.Binarysearchproblems;


import java.util.Arrays;

class problemquestion {
        public static void main(String[] args) {
            int[] array = {1,1,2,2,2,3,3,3,3,5,5,5,5,6,7,7,7,7,8,8,9};
            int[] ans = {-1,-1};
            ans[0]= binarysearch1(array, 7,true);
            ans[1]=binarysearch1(array, 7, false);
            System.out.println(Arrays.toString(ans));
    
        }
        static int binarysearch1(int[] arr , int target,boolean startindex){
            int ans = -1;
            int low = 0;
            int n = arr.length;
            int high = n - 1;
    
            while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]<target){
                low = mid +1;
            }else if(arr[mid]>target){
                high = mid - 1;
            }else{
            ans = mid;
            if(startindex == true){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
    }
        return ans;
        }
    }

