package DSA_Practise.Arrays;

import java.util.Arrays;

public class rotateimage {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        //System.out.println();
        int[][] b = rotate(a);
        System.out.println(Arrays.deepToString(b));

    }
        public static int[][] rotate(int[][] matrix) {
            for(int i=0;i<matrix.length;i++){
                for(int j=i;j<matrix[0].length;j++){
                    int temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
    
            for(int i=0;i<matrix.length;i++){
                       reverse(matrix[i]);
            }
            return matrix;
        }
        public static void reverse(int[] array){
            for(int i=0;i<array.length/2;i++){
                int temp = array[array.length-i-1];
                array[array.length-i-1]=array[i];
                array[i]=temp;
            }
        }

    }

