package DSA_Practise.Sortings;

import java.util.Arrays;
import java.util.Scanner;


public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = bubblesorttt(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] bubblesorttt(int[] arr){
        boolean swapped=true;
        for(int i=0;i<arr.length && swapped;i++){
            swapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                     arr[j]=temp;
                    swapped = true;
                }
            }
        }
        return arr;
    }
}







class UlamSpiral {
    public static void main(String[] args) {
        int size = 5; // Change this to adjust the size of the spiral
        int[][] spiral = generateSpiral(size);
        printSpiral(spiral);
    }
    
    // Generates an Ulam spiral of the given size
    public static int[][] generateSpiral(int size) {
        int[][] spiral = new int[size][size];
        int x = size / 2;
        int y = size / 2;
        int step = 1;
        int count = 0;
        int dx = 1;
        int dy = 0;
        
        while (step <= size) {
            for (int i = 0; i < step; i++) {
                if (isPrime(count)) {
                    spiral[x][y] = 1;
                }
                count++;
                x += dx;
                y += dy;
            }
            if (dx == 1) {
                dx = 0;
                dy = 1;
            } else if (dy == 1) {
                dx = -1;
                dy = 0;
            } else if (dx == -1) {
                dx = 0;
                dy = -1;
            } else if (dy == -1) {
                dx = 1;
                dy = 0;
            }
            if (step % 2 == 1) {
                step++;
            }
        }
        
        return spiral;
    }
    
    // Prints the spiral to the console
    public static void printSpiral(int[][] spiral) {
        for (int[] row : spiral) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    // Returns true if the given number is prime, false otherwise
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}



class UlamSpira {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the Ulam Spiral: ");
        int size = input.nextInt();
        input.close();

        int[][] spiral = new int[size][size];
        int num = 1;
        int row = size / 2;
        int col = size / 2;
        spiral[row][col] = num;
        num++;

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                col++;
                spiral[row][col] = num;
                num = isUlam(num) ? num + 1 : num;
            }
            for (int j = 0; j < i; j++) {
                row--;
                spiral[row][col] = num;
                num = isUlam(num) ? num + 1 : num;
            }
            i++;
            for (int j = 0; j < i; j++) {
                col--;
                spiral[row][col] = num;
                num = isUlam(num) ? num + 1 : num;
            }
            for (int j = 0; j < i; j++) {
                row++;
                spiral[row][col] = num;
                num = isUlam(num) ? num + 1 : num;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%5d", spiral[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isUlam(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                for (int j = i + 1; j <= n; j++) {
                    if (isPrime(j) && i + j == n) {
                        count++;
                        if (count > 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return count == 1;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


class bbss{
    public static void main(String[] args) {
        int[] arr ={2,4,3,5,1};
        System.out.println(Arrays.toString(bbsss(arr)));

    }
    static int[] bbsss(int[] arr){

        boolean sw = true;
        for(int i=0;i<arr.length-1 && sw;i++){
            sw = false;
            for(int j=1;j<arr.length-i ;j++){

                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                   sw = true;
                }
            }
        }
        return arr;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}