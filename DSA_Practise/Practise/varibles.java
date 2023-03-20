import java.util.Arrays;

public class varibles {
    int a=10;
    int b=90;
    String s1;
    int z=75;
    static int sum=60;
    static String str = "Hemanth";
    varibles(){
    //   this.sum = 55;
       this.a=5;
       this.s1="emily";
       System.out.println("Hello");

    }

    public static void main(String[] args) {
        int b=25;

        String s2 = "Chowdary";
        System.out.println("These are local variables:"+" " +b+" "+s2);
        varibles v = new varibles();
        varibles v1 = new varibles();

        System.out.println("These are instance variables:"+" "+v.a+" "+v.s1);
        System.out.println("These are instance variables:"+" "+v.z+" "+v1.s1);

        System.out.println("These are static varibales:" +" "+sum+" "+str);
    }

}




class datatypes{
    public static void main(String[] args) {
        
       boolean flag = true;     
       byte b = 1;
       byte a=2;
     //  short s = 20000;
       int i = 15;
       float f = 2.586865111111f;
       double d = 332.3222222;
    //   long l = 23232323;

       String binary[]={
        "0000","0001","0010","0011","0100","0101",
        "0110","0111","1000","1001","1010",
        "1011","1100","1101","1110","1111"
      };
      
      //int size = Integer.BYTES

       if(b==127){
       flag = false;
       System.out.println(flag);
       }
       System.out.println(binary[i]);
       System.out.println(a|b);
       System.out.println(String.format("%.2f", f));//"%.7f\n",f);
       System.out.println(String.format("%.5f",d));

    }
}








class power{
    public static void main(String[] args) {
        int ans = powerofnum(3,3);
        long g =powerofnum(2,5 );
        System.out.println(g);
        System.out.println("power of 2 and 5 is :"+ans);
    }

    static int powerofnum(int power,int base){
        int result=1;
         for(int i=0;i<power;i++){
            result = base * result;
         }
         return result;
    }
}



class arr{
    public static int length;

    public static void main(String[] args) {
        int arr1[][] = {{1,1},{2,2}};
        String [] str = new String[5];
        char[] c = new char[5];
        boolean[] bool = new boolean[5];
        
      //  int count=0;
        for(int i=0;i<2;i++){
          //  count++;

            for(int j=0;j<2;j++)
        //    count++;
            System.out.print(arr1[i][j] + " " + str[i] + " "+ c[i]+ " "+ bool[i]);
            System.out.println();
            
            
        }
    }
}


class passval{
    public static void main(String[] args) {
        int a = 5;
        int[] arr = {1,2};
        System.out.println(inc(a));
        System.out.println(a);
        
        
        System.out.println(Arrays.toString((arr)));

        System.out.println(Arrays.toString(arrex(arr)));
        System.out.println(Arrays.toString((arr)));

    }
    static int inc(int num){
        num++;
        return num;
    }
    static int[] arrex(int[] a){
        a[0]=4;
        a[1]=5;
        return a;
    }
}



class strnggg{
    public static void main(String[] args) {
        String s = "rakesh";
        char[] c = s.toCharArray();
        System.out.println(Arrays.toString(c));
    }
}