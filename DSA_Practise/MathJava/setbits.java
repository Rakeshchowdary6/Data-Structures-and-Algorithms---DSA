package DSA_Practise.MathJava;

public class setbits {
    public static void main(String[] args) {
          int arr[] = {2,2,2,7,7,7,8,8,8};
          //int ans = countVerticalSetBits(arr);
          countVerticalSetBits(arr);
    }
       static void countVerticalSetBits(int[] arr) {
            for (int i = 0; i < 32;i++) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    count += (arr[j] >> i) & 1;
                }
                System.out.print(count + " ");
            }
        }
        
    }

