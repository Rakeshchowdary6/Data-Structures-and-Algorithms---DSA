package DSA_Practise.Linearsearch;

import java.util.Arrays;

public class linearsearch {
    public static void main(String[] args) {
        int arr[] = {11,2,3,3232,123,233,433};
        int ans = linearsearch1(arr, 2000);
        System.out.println(ans);

        boolean ans1 = linearsearch2(ans);
        System.out.println(ans1);
    }

    static int linearsearch1(int[] arr1, int target){
         if(arr1.length == 0){
            return -1;
         }

         for(int i=0;i<arr1.length;i++){
            if(arr1[i]==target){
                return i;
            }
         }
         return -1;
    }

    static boolean linearsearch2(int answer){
          if(answer==-1){
            return false;
          }
          return true;
    }
}


class stringsearch{
    public static void main(String[] args) {
        String s = "rakesh";
        char[] ch = s.toCharArray();
        System.out.println(Arrays.toString(ch));
        int ans = stringsearch1(s, 's');
        System.out.println(ch[4]);
        System.out.println(ans);

    }

    static int stringsearch1(String str, char c){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }
}


class searchintwodarr{
    public static void main(String[] args) {
        int[][] arr = {
                       {22,31,54},
                       {566,938,940,87,66},
                       {322,5}
                      };
        int[] ans = searchintwodarray(arr, 32233);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }

    }
    static int[] searchintwodarray(int[][] array,int target){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
