package DSA_Practise.MathJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class countsetbits {
    public static void main(String[] args) {
        System.out.println(setbitscount(35));
        System.out.println(Integer.toBinaryString(32));
        System.out.println(Integer.bitCount(32));
    }

    static int setbitscount(int n){
        int count=0;
        while(n>0){
           // n= n - (n& (-n));
            //count++;
            int lsb = n & 1;
            n=n>>1;
            if(lsb==1){
                count++;
            }
            
        }
        return count;
    }
}



class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int n=image[0].length;
        for(int i=0;i<image[0].length/2;i++){
            int[] temp = image[0];
            image[0]=image[n-i-1];
            image[n-i-1]=temp;
        }
        return image;
    }
}

class countofchars{
    public static void main(String[] args) {
        
        String str = "iii am rakesh";

        for(int i=0;i<str.length();i++){
            int count=1;
              for(int j=1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j) && str.charAt(j)!=' '){
                    count++;


                }

              }
              System.out.println(str.charAt(i)+ " " + (count-1));


        }
    }
}




class dupchars{
    public static void main(String[] args) {
        
        String str = "aaabbbccccddd  eeeee  ffffff";

        char[] arr = str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();
        
        
        for(char ch : arr){
            if(Character.isAlphabetic(ch)){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        }
        System.out.println(map);

     }
}









class Solutionssss {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
    static public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if((i%3==0) && (i%5==0)){
                res.add("FizzBuzz");
            }
        }
        return res;
    }
}