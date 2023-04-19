package DSA_Practise.Leetcodeproblems;

public class buyandsell {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
    public static int maxProfit(int[] prices) {
        int min =Integer.MAX_VALUE;
        int max = 0;
        int maxIndex=0,minIndex=0;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
                minIndex=i;
            }
            
        }
        for(int j=min;j<prices.length;j++){
            if(max<prices[j]){
                max=prices[j];
                maxIndex = j;

            }
        }
        return prices[maxIndex]-prices[minIndex];
    }
}
