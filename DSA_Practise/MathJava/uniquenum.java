package DSA_Practise.MathJava;


public class uniquenum {
    public static void main(String[] args) {
        
    
    int arr[] = {1,1,2,3,3,4,4,8,8};
    int uniquenumber =0;
    for(int i=0;i<arr.length;i++){
          uniquenumber^=arr[i];
    }
    System.out.println(uniquenumber);

}
}
