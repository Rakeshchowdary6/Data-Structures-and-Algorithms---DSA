// class arms{
//     public static void main(String args[]){
//         int n=153, r=0 , sum=0 , c= 0;
//         int t1=n , t2=n;
//         int i ;
//         while(t1!=0){
//             //c=c+1;
//             t1=t1/10;
//           c+=1;
//        }
//        System.out.println(c);

        

//         while(t2!=0){
//             r=t2%10;
//             int mul=1;
//             for(i=1;i<=c;i++){
//                 mul=r*mul;
//             }
//             sum=sum+mul;
//             t2=t2/10;
//         }
//         System.out.println(sum);
//             if(sum==n){
//                 System.out.println("YES");
//             }else{
//                 System.out.println("NO");
//         }
//       //  System.out.println(c);
//     }
// }


    

// class armstrong{
//     public static void main(String[] args) {
//         int rem   , mul;

//         for(int i=100;i<1000;i++){
//             int temp=i;
//             int sum=0;
//             while(temp>0){
//                 rem=temp%10;
//                 mul=rem*rem*rem;
//                 sum+=mul;
//                 temp/=10;
//             }
//             if(sum==i){
//                 System.out.print(i+" ");
//             }
//         }
//     }
// }




class lengthofnum{
    public static void main(String[] args) {
        int n=1534236469;
        int rem=0;
      //  int count = 0;
        int rev = 0;
        while(n!=0){
            rem = n%10;
            n=n/10;
            rev = (10 * rev) + rem;
        //    count++;
        }
        System.out.println(rev);
        
    }
}


class div{
    public static void main(String[] args) {
        int a =-123 ; 
        int b =2;
        System.out.println(a/b);
        System.out.println(a%10);
    }
}

