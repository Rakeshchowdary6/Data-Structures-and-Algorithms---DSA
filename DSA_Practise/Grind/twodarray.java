package DSA_Practise.Grind;


import java.util.*;

public class twodarray {
    public static void main(String[] args) {
        
    //  /  String[][] strr = { {"rakesh","abhi"},{"sinu","asi","adi"}};

      String[][] str2 = new String[3][2];

    //a int[][] arr = new int[3][];

        Scanner s = new Scanner(System.in);

    //     for(int i=0;i<arr.length;i++){
    //         for (int j=0;j<arr[i].length;j++){
    //            System.out.print(arr[i][j]+ " ");
    //           //  System.out.println(Arrays.toString(arr));
    //         }
    //         System.out.println();
    //     }
    //     System.out.println();

    //     for(int i=0;i<str2.length;i++){
    //         System.out.println(Arrays.toString(str2[i]));
    //      //  for(int j=0;j<strr[i].length;j++){
              
    //      //   System.out.print(strr[i][j]+" ");
    //     }
    //     System.out.println();

    //   //  System.out.println(Arrays.toString(strr));


      for(int i=0;i<str2.length;i++){
        for(int j=0;j<str2[i].length;j++){
             str2[i][j] = s.next();
        }
        // System.out.println();
      }

      for(int i=0;i<str2.length;i++){
        System.out.println(Arrays.toString(str2[i]));
     //  for(int j=0;j<strr[i].length;j++){
          
       //  System.out.print(strr[i][j]+" ");
    }
    // for(int i=0;i<arr.length;i++){
    //             for (int j=0;j<arr[i].length;j++){

    //                  arr[i][j] = s.nextInt();
    //             }
    //         }
    

        s.close();
    }

    }


    class reverse{
        public static void main(String[] args) {
            int arr [] = { 1,2,3,4,5,6};

            int start = 0;
            int end = arr.length-1;
            int temp = arr[0];
            while(start<=end){
                temp = arr[start];
                arr[start]=arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            // for(int i=0;i<arr.length;i++){
            // System.out.print(arr[i]);
            // }
            System.out.println(Arrays.toString(arr));
        }
    }

//     class revfun{
//         public static void main(String[] args) {
            
//         int[] nums = {1,2,3,4,5};
//         int ans = revarray(nums);

//         // for(int i=0;i<arr.length;i++){

//         // System.out.println(ans[i]);
//         // }

//         static int[] revarray(int[] arr){
//             int start = 0;
//             int end = arr.length-1;
//             int temp = arr[0];
//           //  int reversedarr[] = new int[arr.length];
//             while(start<=end){
//                 temp = arr[start];
//                 arr[start]=arr[end];
//                 arr[end] = temp;
//                 start++;
//                 end--;
//         }
//         // for(int i=0;i<arr.length;i++){
//         //     reversedarr[i]=arr[i];
//         //}
//         return arr;
//         }
//     }
// }




class revarray2{
  public static void main(String[] args) {
    
    int arr[] = new int[]{1,2,3,4,5,6};

  //   Scanner s = new Scanner(System.in);
     int n=arr.length;
  //   for(int i=0;i<arr.length;i++){
  //     arr[i]=s.nextInt();
  //   }
  //  // System.out.println(Arrays.toString(arr));
  //   s.close();

   // int temp = arr[0];
   // int j=0;
    for(int j=0;j<n/2;j++){
        int  temp=arr[j];
         arr[j]=arr[n-j-1];
         arr[n-j-1]=temp;
    //     j++;
    //     System.out.println(n);
   // System.out.println(j);
  
    }

    System.out.println(Arrays.toString(arr));

  }

}


class arrlist{
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    ArrayList<Integer> l1 = new ArrayList<>(10);
   ArrayList<String> l2 = new ArrayList<>(5);

    l1.add(2);
    l1.add(50);
    l1.add(2, 75);
    l1.add(3, 100);
    l1.add(4, 125);
    l1.add(25);
    l1.add(50);
    l1.add(25);
    l1.add(50);
    l1.add(25);
    l1.add(50);
     

    // System.out.println(l1.set(2, 250));

    // System.out.println(l1.get(9));

    l2.add("rakesh");
    // l2.add("Hey");

    // System.out.println(l1 + " " + l2);


    // for(int i=0;i<5;i++){
    //   l1.add(s.nextInt());
    // }

   System.out.println(l1);
   s.close();
  }
}



class twodarrays{
    public static void main(String[] args) {
      
      int lestshift = 1 << 1;
      int rightshift = 1>>1;
      System.out.println(lestshift + " " + rightshift);
      
      }
    }




class twodddarray{  
  public static void main(String[] args) {
    
    int[][] arr = {{1,1}};

    System.out.println(arr[0][0]);
    System.out.println(arr.length);
  }
}



class Solutionfftgtg {
  public static void main(String[] args) {
    int[][] a = {{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
    System.out.println(matrixSum(a));
  }
  public static int matrixSum(int[][] nums) {
      int sum=0;int min=0;
      for(int i=0;i<nums.length;i++){
           min=0;
         
          for(int j=i;j<=i;j++){
                if(min<nums[i][j]){
                    min=nums[i][j];
                }
          }
          
      }
      sum += min;
      return sum;
  }
}