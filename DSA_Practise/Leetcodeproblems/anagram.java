//package DSA_Practise.Leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

public class anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        //isAnagram(s, t);
        System.out.println(isAnagram(s, t));
    }
        static boolean isAnagram(String s, String t) {
       //     char[] schars = s.toCharArray();
       //     char[] tchars = t.toCharArray();
   
       //     Arrays.sort(schars);
       //     Arrays.sort(tchars);
   
       //     return new String(schars).equals(new String(tchars));
           if(s.length()!=t.length()) {
               return false;
           }
           int[] freq = new int[26];
           for(int i=0;i<s.length();i++){
               freq[s.charAt(i)-'a']++;
               freq[t.charAt(i)-'a']--;
   
           }
           for(int i=0;i<freq.length;i++){
               if(freq[i]!=0){
                   return false;
               }
           }
           return true;
       }


   }


   class anagr {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        //isAnagram(s, t);
        System.out.println(isAnagram(s, t));
    }
   
    static boolean isAnagram(String s, String t) {


   //1st Method
   //     char[] schars = s.toCharArray();
   //     char[] tchars = t.toCharArray();

   //     Arrays.sort(schars);
   //     Arrays.sort(tchars);

   //     return new String(schars).equals(new String(tchars));

   //2nd method
       // if(s.length()!=t.length()) {
       //     return false;
       // }
       // int[] freq = new int[26];
       // for(int i=0;i<s.length();i++){
       //     freq[s.charAt(i)-'a']++;
       //     freq[t.charAt(i)-'a']--;

       // }
       // for(int i=0;i<freq.length;i++){
       //     if(freq[i]!=0){
       //         return false;
       //     }
       // }
       // return true;
       //3rd method
       Map<Character,Integer> map = new HashMap<>();
        if(s.length()!=t.length()) {
            return false;
        }
       for(int i=0;i<s.length();i++){
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
           map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
       }
       for(char c : map.keySet()){
           if(map.get(c)!=0){
               return false;
           }
       }
       return true;
   }
}