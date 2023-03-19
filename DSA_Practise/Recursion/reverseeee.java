package DSA_Practise.Recursion;

public class reverseeee {
    public static void main(String[] args) {
        int ans = reverse(12029);
        System.out.println(ans);
    }
    static int reverse(int n){
        
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);
    }
    static int helper(int n, int digits) {
        //int count=0;
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return (int) (rem * Math.pow(10, digits-1) + helper(n/10, digits-1));
    }
}
