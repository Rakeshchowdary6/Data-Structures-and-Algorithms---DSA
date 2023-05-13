package DSA_Practise.Leetcodeproblems;

public class lcgetlucky {
    public static void main(String[] args) {
        String s = "qhquvppzooyt";
        int k=6;
        System.out.println(getLucky(s, k));
    }
        public static int getLucky(String s, int k) {
            int sum=0;
            int rem=0;
            int rem1=0;
            int sum2=0;
            for(int i=0;i<s.length();i++){
                int a = s.charAt(i)-'a' + 1;
                if(a>9){
                    while(a!=0){
                        rem= a %10;
                        sum +=rem;
                        a=a/10;
                    }
                }else{
                    sum += a;
                }
            }
            if(k==1){
                return sum;
            }
    
            while(k!=0 && sum!=0){
                  rem1 = sum % 10;
                  sum2 += rem1;
                  sum = sum/10;
                  k--;
            }
            return sum2;
        }  
    }

