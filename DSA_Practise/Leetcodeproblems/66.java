package DSA_Practise.Leetcodeproblems;

//package DSA_Practise.Leetcodeproblems;

import java.util.Arrays;

class ssslc {
    public static void main(String[] args) {
        int[] aa = {9,9};
        System.out.println(Arrays.toString(plusOne(aa)));
    }
        static int[] plusOne(int[] digits) {
            
        int n = digits.length;
            for(int i=n-1; i>=0 ; i--)
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
    
            }
            else{
                digits[i]=0;
            }
     
        
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        
        return newNumber;
    
    }
    }
