package DSA_Practise.Grind;
public class armstrong{
    public static void main(String[] args) {
        int rem   , mul;

        for(int i=100;i<1000;i++){
            int temp=i;
            int sum=0;
            while(temp>0){
                rem=temp%10;
                mul=rem*rem*rem;
                sum+=mul;
                temp/=10;
            }
            if(sum==i){
                System.out.print(i+" ");
            }
        } 
        
    }
}