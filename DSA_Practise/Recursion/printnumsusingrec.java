package DSA_Practise.Recursion;

public class printnumsusingrec {
    public static void main(String[] args) {
        //fibforward(5);
       fibreverse(5);
    }
    static void fibforward(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        fibforward(n-1);
    }
    static void fibreverse(int n){
        if(n==0){
            return;
        }
        fibreverse(n-1);
        System.out.println(n);
    }
}
