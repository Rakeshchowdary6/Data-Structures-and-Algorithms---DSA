package DSA_Practise.Grind;


public class prime {
    public static void main(String args[]){
        int n=15;
       // int count=0;
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    count=count+1;
                }
            }
            if (count==1){
                System.out.print(i+" ");
            }
        }
    }
}

 



class primeornot{
    public static void main(String[] args) {
        
        int num = 43; 
        int i=2;
        int count = 0;
        while(i*i<=num){

            if(num%i==0){
              
                count++;
               
            }
            i++;
        }
        
       // System.out.println(count);
       // System.out.println(i);
        if(count>0){
            System.out.println("NOTPRIME");
        }   
        else{
            System.out.println("PRIME");
        } 

    }
}




class primeeanothermethod{
    public static void main(String[] args) {
        
        
        int n = 100;
        for(int i=2;i<=n;i++){
            System.out.println(i + " " + "is prime or not / give true or false :  " + isprime(i));
        }
    }

    static boolean isprime(int n){

        int i=2;
        while(i * i <= n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}

