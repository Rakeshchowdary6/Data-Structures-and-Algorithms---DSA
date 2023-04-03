//package Practise;
public class armstrongg{
    static public void main(String[] args) {
        int arr[] = {1,2,3,4};
        int len = arr.length;
     //   for(i=0;i<arr.length;i++){
      //      sum += arr[i];
         //   System.out.println(arr[i]);

       // }
      //  System.out.println(arr[i]);
        int sum = len * (len+1)/2;

        for(int i=0;i<arr.length;i++){
            arr[i]+=sum;
            System.out.println(arr[i]);
        }

    }
}


 
