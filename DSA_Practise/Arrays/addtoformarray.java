package DSA_Practise.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class addtoformarray {
    public static void main(String[] args) {
        int[] a = {6};
        int k =809;
        System.out.println(addToArrayForm(a, k));
    }
        public static List<Integer> addToArrayForm(int[] num, int k) {
            if(num[0]==0 && num.length ==1 ){
                List<Integer> l = new ArrayList<>();

                while(k!=0){
                int a = k%10;
                l.add(a);
                k = k/10;
            }
            Collections.reverse(l);
            return l;
        }
            
            for(int i=num.length-1;i>=0;i--){
                   int rem =0;
                   int a = 0;
                   if(k>=0){
                    rem = k % 10;
                    num[i]=num[i]+rem;
                    k = k/10;
                    if(num[i]>=10){
                          a = num[i]/10;
                          num[i] = num[i]%10;
                          if(i>0){
                        num[i-1] += a;
                    }else{
                        List<Integer> l = new ArrayList<>();
                        l.add(a);
                        for(int j=0;j<num.length;j++){
                            l.add(num[j]);
                        }
                        return l;
                    }
                    }
                    // else if(num[i]<10 && num.length==1 && k!=0){
                    //     List<Integer> l = new ArrayList<>();
                    //     l.add(k);
                    //     for(int j=0;j<num.length;j++){
                    //         l.add(num[j]);
                    //     }
                    //     return l;
                    // }
               }
        }
        List<Integer> l = Arrays.stream(num).boxed().collect(Collectors.toList());
        return l;
    }
}