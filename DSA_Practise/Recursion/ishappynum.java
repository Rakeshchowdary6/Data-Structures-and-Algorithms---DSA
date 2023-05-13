package DSA_Practise.Recursion;

public class ishappynum {
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        int rem =0,sum=0;
        while(n!=0){
            rem= n%10;
            sum += rem * rem;
            n=n/10;
            
        }
        if(sum==1){
            //isHappy(sum);
            return true;
        }else{
            return isHappy(sum);
        }
    }
}     

class Solutionlcprblm {
    public static void main(String[] args) {
        int n=2;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {

        return helper(n);
    }
    public static boolean helper(int n){
        int rem =0,sum=0;
        while(n!=0){
            rem= n%10;
            sum += rem * rem;
            n=n/10;
            
        }
        if(sum>1){
                //isHappy(sum);
                return false;
            }else{
                return helper(sum);
            }
    }
}   




class Solutiondedd {
    public static void main(String[] args) {
        int n=1111111;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {

        return helper(n);
    }
    public static boolean helper(int n){
        int rem =0,sum=0;
        while(n!=0){
            rem= n%10;
            sum += rem * rem;
            n=n/10;
            
        }
        
        if(sum==1){
                //isHappy(sum);
                return true;
            }else if(sum>1 && sum<10){
                return false;
            }else{
                return helper(sum);
            }
    }
    }
