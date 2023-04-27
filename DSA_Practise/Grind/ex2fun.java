package DSA_Practise.Grind;

import java.util.Arrays;

// public class funcex{
//     public static void main(String[] args) {
//      //  display(); 
//        int arr1[] = {1,2,3,4,5};
//          isEven(arr1);
//      //  isEven(10);
//      //  isEven(555);
//          System.out.println();
//     }

//     //static void display(){
//      //   System.out.println("I am Rakesh");
//     //}

//     public static void isEven(int[] num){
        
//         for(int i=0;i<num.length;i++){
//         if(num[i]%2==0 ){
//             System.out.println("even" + " " +num[i]);
        
//         }else{
//             System.out.println("odd" +" " +num[i]);
//         }
//     }
//     }

// }

//import java.util.Arrays;

class ex2fun{
  public static void main(String[] args) {
    //    String r = " rakesh says hi ";
    //    String a = greet(r);
    //    System.out.println(a);

    //    sum(5, 5);

    //    int ans = sum(10, 50);
    //    System.out.println(ans);
       
    //    int a = 2, b = 3;
    //    swap(a,b);   
    //    System.out.println(a + " " + b);

       int[] arr99 = {1,2};
       System.out.println(arr99[0]);
       changearray(arr99);
       System.out.println(Arrays.toString(arr99));

    //   System.out.println(b);


  }
  static void changearray(int[] nums){

    nums[0] = 10;
    nums[1] = 11;

   System.out.println(Arrays.toString(nums));
   

  }

//   static String greet(String name){
//     String msg = "Hello I am Rakesh" + name ; 
//     return msg;
//   }

//   static int sum(int a, int b){
//     int sum = a +b;
//     return sum;
//   }


//  static void swap(int m,int n){
//   int temp = m;
//     m =n;
//     n = temp;
//     System.out.println(m+ " " + n);

}




class arrayssexample{
  public static void main(String[] args) {
    int[] a = {10 , 20};
   // System.out.println(a[0]);
    System.out.println(Arrays.toString(a));


    changearr(a);
    System.out.println(Arrays.toString(a));


  }

    static void changearr(int[] nums){

          nums[0] = 100;
          nums[1] = 200;
          System.out.println(Arrays.toString(nums));
    }
  }

