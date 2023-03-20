
public class fibo {
    public static void main(String[] args) {
        int n1 =0;
        int n2 =1;

    //    for(int i=0;i<11;i++){
    //     //   System.out.println(fibformula(50));
    //    }

        //int next = n1 + n2;

        System.out.print( n1 + " "+ n2 + " ");

        for(int i=0;i<50;i++){
        int n3 = n1 + n2;
        n1 = n2;
        n2 = n3;

        System.out.print(n3+" ");
        }
    }
}

      //  }

//        Scanner s = new Scanner(System.in);

//         int n = s.nextInt();
//      //   for(int n=1;n<10;n++){
//         long ans = (int)(1/Math.sqrt(5) * Math.pow((1 + Math.sqrt(5))/2,n));
    


//        System.out.print(ans + " ");

//         s.close();
//     }

//         // static long fibformula(int n){
//         //     return (int) (Math.pow(((  1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
//         // }

    
// }
// }



class fibusingfun{
    public static void main(String[] args) {
        int ans = fibinacci(4);
        System.out.println(ans);
    }
    static int fibinacci(int n){
        //fibinacci(0) = 0;
        if(n<2){
            return n;
        }
        int ans = fibinacci(n-1) + fibinacci(n-2);
        return ans;

    }
}

class f{
    public static void main(String[] args) {
        for(int n=0;n<11;n++){
        System.out.println(fib(n));
    }
}
      //Scanner s = new Scanner(System.in);

        //int n = s.nextInt();
        static int fib(int n){
        return (int) ((Math.pow(((1 + Math.sqrt(5))/2),n)- Math.pow(((1 - Math.sqrt(5))/2),n))/Math.sqrt(5));
        
        // return (int)ans;
        }
    
}
    
