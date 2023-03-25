import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leadersofarray {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        System.out.println(leader(a));
    }
    static List<Integer> leader(int[] arr){
        List<Integer> l = new ArrayList<>();
        //l.add(arr[arr.length-1]);
        boolean leader = true;
        for(int i=0;i<arr.length-1;i++){
             leader = true;
             for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    leader=false;
                    break;
                }
            }
             
             if(leader==true){
                l.add(arr[i]);
             }
             if(i==arr.length-2){
                 l.add(arr[arr.length-1]);
             }
            
        }
        return l;
    }
}



class leadersofarraysecond{
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        System.out.println(leaderornot(arr));
    }
    static List<Integer> leaderornot(int[] arr){

        List<Integer> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
              if(arr[i]>max){
                max=arr[i];
                list.add(max);
              }
        }
        Collections.reverse(list);
        return list;
    }
}