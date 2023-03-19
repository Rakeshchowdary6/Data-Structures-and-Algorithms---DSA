package DSA_Practise.Recursion;

public class factorial {
    public static void main(String[] args) {
        int ans = factoriallll(5);
        System.out.println(ans);
    }
    static int factoriallll(int n){
        if(n<=1){
            return 1;
        }
        return n * factoriallll(n-1);
    }
}


class GFG {
    
    static void printFun(int test)
    {
        if (test < 1)
            return;
 
        else {
            System.out.printf("%d ", test);
 
            // Statement 2
            printFun(test - 1);
 
            System.out.printf("%d ", test);
            return;
        }
    }
 
    public static void main(String[] args)
    {
        int test = 3;
        printFun(test);
    }
}