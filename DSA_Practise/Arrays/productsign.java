package DSA_Practise.Arrays;

public class productsign {
    public static void main(String[] args) {
        int[] a = {-1,1,-1,1,-1};
        System.out.println(arraySign(a));
        }
    
        public static int arraySign(int[] nums) {
            // long pro =1;
            int negcount = 0;
             for(int i=0;i<nums.length;i++){
               //  pro *= nums[i];
               if(nums[i]<0){
                   negcount++;
               }else if(nums[i]==0){
                   return 0;
               }
             }
     
             if(negcount%2==0){
                 return 1;
             }else if(negcount==1){
                 return -1;
             }
     
             
              return 0;
         }
    }



    class Solutionmnm {
        public static void main(String[] args) {
            int[] a = {9,7,10,7};
            int[] b = {10,2,4,10};

            System.out.println(isWinner(a, b));
        }
        public static int isWinner(int[] player1, int[] player2) {
            int score1 = 0,score2=0;
            for(int i=0;i<player1.length;i++){
                score1 += player1[i];
                if(player1[i]==10){
                    for(int j=i+1;j<player1.length;j++){
                    score1 += (player1[j] * 2);
                    }
                    i=player1.length;
                }
            }
            for(int m=0;m<player2.length;m++){
                score2 += player2[m];
                if(player2[m]==10){
                    for(int k=m+1;k<player2.length;k++){
                    score2 += (player2[k] * 2);
                    }
                    m=player2.length;
                }
            }
            if(score1>score2){
                return 1;
            }else if(score1<score2){
                return 2;
            }
        return 0;
        }
    }