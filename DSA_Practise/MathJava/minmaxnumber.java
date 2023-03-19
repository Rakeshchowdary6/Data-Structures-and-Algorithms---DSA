package DSA_Practise.MathJava;

public class minmaxnumber {
    public static void main(String[] args) {
        int[] array = {22,32,1,35,77,65,0,100};
        int ans = min(array);
        int ans1 = max(array);
        System.out.println(ans);
        System.out.println(ans1);
    }

    static int min(int[]arr){
        int min = Integer.MAX_VALUE;
       for(int i : arr){
        if(min>i){
            min=i;
        }
       }
       return min;
    }

    static int max(int [] arr){
         int max = Integer.MIN_VALUE;
         for(int i : arr){
            if(max<i){
                max=i;
            }
           }
           return max;

    }
}
