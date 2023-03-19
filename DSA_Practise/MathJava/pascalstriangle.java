package DSA_Practise.MathJava;

public class pascalstriangle {
        public static void printPascalTriangle(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(binomialCoeff(i, j) + " ");
                }
                System.out.println();
            }
        }
        public static int binomialCoeff(int n, int k) {
            int res = 1;
            if (k > n - k) {
                k = n - k;
            }
            for (int i = 0; i < k; ++i) {
                res *= (n - i);
                res /= (i + 1);
            }
            return res;
        }
        public static void main(String[] args) {
            int n = 8;
            printPascalTriangle(n);
        }
    }
    
