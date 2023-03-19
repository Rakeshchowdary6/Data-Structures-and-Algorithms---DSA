package DSA_Practise.Patterns;

public class patterns {


// * 
// * *
// * * *
// * * * *
// * * * * *

    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


class pattern2{

    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



class pattern3{

//         * 
//       * *
//     * * *
//   * * * *
// * * * * *
public static void main(String[] args) {
    int n=5;
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            System.out.print("  ");
        }
        for(int j=0;j<=i;j++){
        System.out.print("* ");
    }

    System.out.println();
}
}
}


class pattern4{

    // * * * * * 
    //   * * * *
    //     * * *
    //       * *
    //         *


    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
                
                System.out.print(i+1+" ");
            }
            System.out.println();
        }

    }
}




class pattern5{
    public static void main(String[] args) {
        
        int n=3;
        int len=(2*n)-1;
        int start=0;
        int end = len-1;
        int arr[][] = new int[len][len];
        while(n!=0){
        for(int i=0;i<=end;i++){
           for(int j=0;j<=end;j++){
            if(i==start   || j==start || i==end || j==end){
                //System.out.print(n);
                arr[i][j]=n;
            }
            
          // System.out.println();
           }
            start++;
            end--;
            n--;
        }
    }

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    }




    class pattern55{
        public static void main(String[] args) {
            
            int n=5;
            int len=(2*n)-1;
            int arr[][] = new int[len][len];
            
            for(int i=0; i<len; i++) {
                for(int j=0; j<len; j++) {
                    int min = Math.min(i, j);
                    min = Math.min(min, len-1-i);
                    min = Math.min(min, len-1-j);
                    arr[i][j] = n-min;
                }
            }
            
            for(int i=0;i<len;i++){
                for(int j=0;j<len;j++){
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
    



    class arraaayss{
        public static void main(String[] args) {
            int [] arr = {1,2,2,35,6};
            int [][] arr1 = {{1,3,4},{3,2,4}};
            
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }

            System.out.println("============");


            for(int[] row : arr1){
                for(int j : row){
                    System.out.print(j);
                }
                System.out.println();
            }
        
        }
    }
    