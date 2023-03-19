package DSA_Practise.MathJava;

public class flipandinvert {
    public static void main(String[] args) {
        int array[][] = {{1,1,0},{1,1,1},{1,1,0}};

        int[][] result = flipinvert(array);
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
            
    }
        static int[][] flipinvert(int arr[][]){
        
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<(arr[i].length+1)/2;j++){
                int temp = arr[i][j]^1;
                arr[i][j] = arr[i][n-j-1]^1;
                arr[i][n-j-1] = temp;
            }
        }
        return arr;
    }
}
