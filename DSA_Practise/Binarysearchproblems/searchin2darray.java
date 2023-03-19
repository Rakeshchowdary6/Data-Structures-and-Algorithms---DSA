package DSA_Practise.Binarysearchproblems;

public class searchin2darray {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        boolean a = searchMatrix(arr, 7);
        System.out.println(a);
    }

static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length-1;

        while(row<matrix.length && col>=0 ){
            if(matrix[row][col]<target){
                row++;
            }else if(matrix[row][col]>target){
                col--;
            }
            if(matrix[row][col]==target){
                return true;
            }
        }
        return false;
    }
}





class newsearchintwodarray {
    public static void main(String[] args) {
        int[][]arr = {{3},{-1}};
        boolean ans = searchMatrix(arr, -1);
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(ans);
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;

        if(matrix.length == 1 ){
            int start = 0;
            int end = matrix[0].length-1;

            while(start<=end){
            int mid = start + (end-start)/2;
        //     if(matrix[0][mid] == target){
        //     return true;
        // }
            if(matrix[0][mid] < target){
            start = mid +1;
            }else if(matrix[0][mid]>target){
            end = mid - 1;
        }else{
            return true;
        }
        
    }
//}
        // }else if(matrix[row].length==1){

            
        //         if(matrix[row][0]==target){
        //             return true;
        //         }
            
         }else
        
    

        while(row<matrix.length && col>=0){

            if(matrix[row][col]<target){
                row++;
            }else if(matrix[row][col]>target){
                col--;
            }
            if(matrix[row][col]==target){
                return true;
            }
        }
    
        
    
        return false;
    
    }
}

