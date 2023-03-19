package DSA_Practise.Recursion;

public class countzeroes {
    public static void main(String[] args) {
        int ans = countzrs(10009900);
        System.out.println(ans);
    }
    static int countzrs(int n){
        
        return helper(n,0);
    }
    private static int helper(int n,int c) {
        if(n==0){
            return c;
        }
        //int count = 0;
        int rem = n%10;
        if(rem ==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
