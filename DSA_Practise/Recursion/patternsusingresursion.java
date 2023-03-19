package DSA_Practise.Recursion;

import java.util.Arrays;

public class patternsusingresursion {
    public static void main(String[] args) {
        pattern1(0, 4);
        pattern2(4, 0);
        int[] a = {4,3,2,1,0};
        bubblesort(a, 4, 0);
        System.out.println();
        System.out.println(Arrays.toString(a));
    }
    static void pattern1(int row,int col){
        if(col==0){
            return;
        }

        if(row<col){
            System.out.print("* ");
            pattern1(row+1, col);
        }else{
            System.out.println();
            pattern1(0, col-1);
        }
    }

    static void pattern2(int row,int col){
        if(row==0){
            return;
        }

        if(row>col){
            pattern2(row, col+1);
            System.out.print("* ");
        }else{
            pattern2(row-1, 0);

            System.out.println();
        }
    

    }
    static void bubblesort(int[] arr,int row,int col){
        if(row==0){
            return ;
        }
        
        if(row>col){
            if(arr[col]>arr[col+1]){
                int temp = arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            bubblesort(arr, row, col+1);
        }
        bubblesort(arr, row-1, col);
         
    }
}
