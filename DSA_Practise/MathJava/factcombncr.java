package DSA_Practise.MathJava;

public class factcombncr {
    public static void main(String[] args) {
        System.out.println(ncr(5, 0));
    }
    static int ncr(int n,int r){
        int numerator = 1 ;
        int denominator =1;
        for(int i=0;i<r;i++){
             numerator *= (n-i);
             denominator *=(r-i);
        }
        int ans = numerator/denominator;
    return ans;
    }
}
