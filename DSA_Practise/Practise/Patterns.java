import java.util.Scanner;

class Pattern1 
{        

   public static void main(String args[])  
   {  
      Scanner s = new Scanner(System.in);
      System.out.print("Enter n value : " );
      int n=s.nextInt();
      s.close();
      for(int i=0;i<n;i++){
         for(int j=0;j<=i;j++){
            System.out.print("  ");
         }
         for(int j=i;j<n;j++){
            System.out.print("* ");
         }
         System.out.println();
      }
   }  
}  

    /*
*
**
***
****
***** */


class Pattern99
{        

   public static void main(String args[])  
   {  
      Scanner s = new Scanner(System.in);
      System.out.print("Enter n value : " );
      int n=s.nextInt();
      s.close();
      for(int i=0;i<n;i++){
         for(int j=i;j<n;j++){
         System.out.print("* ");
         }
         for(int j=0;j<i;j++){
         System.out.print("  ");
         }
      System.out.println();
   }  
}
}  


class pattern2{
   public  static void main(String args[]){
      for(int row=1;row<=10;row++){
         for(int col=10;col>=row;col--){
            System.out.print("* ");
         }
         System.out.println();
       }
      }

   }





/*
*****
****
***
**
*
 */


class pattern3{
   public  static void main(String args[]){

      for (int row=1;row<=5;row++){
         for(int col=1;col<=row;col++){
            System.out.print(col);
         }
         System.out.println();
      }

   }
   /*
1
12
123
1234
12345
    */

}


class pattern4{
   public  static void main(String args[]){
    {
         for (int row=1;row<=5;row++){
            for(int col=1;col<=row;col++){
               System.out.print(col+" ");
            }
      System.out.println();
    }
    for(int col=4;col>=1;col--){
      for(int row=1;row<=col;row++)
      {
         System.out.print(row+" ");
      }
      System.out.println();
    }
   }
}
}


/*   
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */


class pattern11{
   public static void main(String[] args) {
/*       for(int i=1;i<=5;i++){
         for(int j=1;j<=i;j++){
              System.out.print(j+" ");
         }
         System.out.println();
*/
      for( int i=5;i>=1;i--){
         for(int j=1;j<=i;j++){
            System.out.print(j+" ");
         }
         System.out.println(); 
      }
   }
   }