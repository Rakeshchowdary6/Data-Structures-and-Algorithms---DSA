package DSA_Practise.Strings;

import java.util.HashMap;
import java.util.Map;

public class lc748 {
    public static void main(String[] args) {
        String lc = "1s3 PSt";
        String[] w = {"step","steps","stripe","stepple"};
        System.out.println(shortestCompletingWord(lc, w));
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
    HashMap<Character,Integer> map = new HashMap<>();
    String s = licensePlate.replaceAll("[^a-zA-Z]","").toLowerCase();
    for(Character c : s.toCharArray()){
        map.put(c, map.getOrDefault(c, 0)+1);

    }
    
    String sw = null;
    for(String word : words){
        Map<Character,Integer> map1 = new HashMap<>(map);
        for(Character c : word.toCharArray()){
               map1.put(c,map1.getOrDefault(c, 0)-1);
        }

        boolean iscontains = true;
        for(int c : map1.values()){
            if(c>0){
                iscontains=false;
                break;
            }
        }
        if(iscontains && (sw==null || word.length() < sw.length())){
             sw = word;
        }
    }

    return sw;


}
}
