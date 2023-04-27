package DSA_Practise.Grind;

import java.util.Arrays;
import java.util.Scanner;

public class practise{
    public static void main(String[] args) {
        byte b = 5;
        short s = 25;
        int i = 120;
        long l = 2000;
        float f = 5.5f;
        double d = 3.11d;

        System.out.println(" byte b : "+b);
        System.out.println(" short s: "+s);
        System.out.println(" int i: "+i);
        System.out.println(" long l: "+l);
        System.out.println(" double d: "+d);
        System.out.println(" float f: "+f);

        System.out.println(" ==================== AFTER WIDENING CASTING ================= ");

        short s1 = b;
        int i1 = s;
        double d1 = f;
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(d1);

        System.out.println(" ==================== AFTER NARROWING CASTING ================= ");
       
        double d2 = 4.6d;
        byte b1 = (byte) s;
        int i2 = (int) (d2);


        System.out.println(b1);
        System.out.println(i2);
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(a);
        sc.close();
    }
}



class arrExampleInput{
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        String arr[] = new String[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=scc.next();
        }
    //    for(int i=0;i<arr.length;i++){
    //     arr[3] = 33;
    //     System.out.print(arr[i]+" ");
        System.out.println(Arrays.toString(arr));
         scc.close();

    }
}
