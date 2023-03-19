package DSA_Practise.MathJava;

import java.util.Scanner;

public class evenornot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter n the number which is to be checked wthether even or not");
        int n  = s.nextInt();


        int a = n & 1;
        if(a==0){
            System.out.println("EVEN NUMBER");
        }else{
            System.out.println("ODD NUMBER");
        }
        s.close();
    }
}
