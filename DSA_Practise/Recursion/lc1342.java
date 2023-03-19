package DSA_Practise.Recursion;

public class lc1342 {
    public static void main(String[] args) {
        int ans = numberOfSteps(6);
        System.out.println(ans);
    }
    static int numberOfSteps(int num) {
      return helper(num,0);
      
    }
    static int helper(int n,int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            return helper(n/2, steps+1);
        }
        return helper(n-1, steps+1);
    }

}
