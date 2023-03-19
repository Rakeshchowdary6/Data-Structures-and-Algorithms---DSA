package DSA_Practise.MathJava;

public class powerof2 {
    public static void main(String[] args) {
        poweroftwo(50);
    }

    static void poweroftwo(int n){
        if((n & (n-1))==0){

              System.out.println("Given number is power of 2");

        }else{
            System.out.println("Not a power of 2");
        }
    }
}
