package DSA_Practise.Arrays;

import java.util.Arrays;

public class setmatrixzeroes2darray {
    public static void main(String[] args) {
        int[][] a = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        //int[][] modifiedArray = setZeroes(a);
        // for(int i=0;i<modifiedArray.length;i++){
        //     for(int j=0;j<modifiedArray[i].length;j++){
        //         System.out.print(modifiedArray[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        System.out.println(Arrays.deepToString(setZeroes(a)));
    }    
    public static int[][] setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    markrow(i, matrix);
                    markcolumn(j,matrix);
                }
            }
        }
        return matrix;
    }
    private static void markcolumn(int j,int[][] matrix) {
            for(int m=0;m<matrix.length;m++){
                if(matrix[m][j]!=0){
                     matrix[m][j]=-1;
                }
            }
    }
    public static void markrow(int i,int[][] matrix) {
        for(int k=0;k<matrix[i].length;k++){
            if(matrix[i][k]!=0){
                matrix[i][k]=-1;
           }        
        }
    }
}
