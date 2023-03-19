package DSA_Practise.MathJava;


/// This program gives no of digits in binary representation of a number
public class noofdigit {
    public static void main(String[] args) {
        System.out.println(noofdigits(8));
    }
    static int noofdigits(int n){
        int count=0;
        
        while(n!=0){
        n=n>>1;
        count++;
    }
    return count;
}
}



// Getting the number of digits using the formula 

class noofdigitss{
    public static void main(String[] args) {
        int n = 8;
        int base = 2;


        int ans = (int) (Math.log(n)/Math.log(base) + 1);
        System.out.println(ans);
    }
}