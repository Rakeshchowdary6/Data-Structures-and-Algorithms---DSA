package DSA_Practise.Recursion.Strings_Recursion;

import java.util.ArrayList;

public class skipachar {
    public static void main(String[] args) {
       // String s1 = "aaaddsdaaaddsda";
        String s2 = "";
       // String s3 = "aaskdodapplednsdappleaa";
        String s4 = "ABC";
        // skipchar(s2, s1);
        // skipchar1(s1);
        // skipastring(s2, s3);
        System.out.println(subseq1(s2, s4));

    }
    static ArrayList<String> subseq1(String a,String b){
        ArrayList<String> al = new ArrayList<>();
        if(b.isEmpty()){
            al.add(a);
            return al;
        }

        char ch = b.charAt(0);
        
        ArrayList<String> left  = subseq1(a+ch, b.substring(1));
        ArrayList<String> right = subseq1(a, b.substring(1));
        left.addAll(right);
        return left;
    }
    static void skipchar(String p,String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch=='a'){
            skipchar(p, up.substring(1));
        }else{
            skipchar(p+ch, up.substring(1));
        }
    }

    static void skipchar1(String s){
        String s1 = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a'){
                 s1 = s1+s.charAt(i);
            }
        }
        System.out.println(s1);
    }
    static void skipastring(String p,String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(up.startsWith("apple")){
            skipastring(p, up.substring(5));
        }else{
            skipastring(p+ch, up.substring(1));
        }
    }

    static void subseq(String a,String b){
        if(b.isEmpty()){
            System.out.println(a);
            return;
        }

        char ch = b.charAt(0);
        subseq(a, b.substring(1));

        subseq(a+ch, b.substring(1));
    }
    
}



class Solutionssdsd {
    //public boolean isPalindrome(String s) {
        public static void main(String[] args) {
            
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        System.out.println(s);
    }
}

class Solutiondsdsdsd {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Pana";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start = 0;
        int end = s.length()-1;
        if(s.isEmpty()){
            return true;
        }
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}


class permutation{
    public static void main(String[] args) {
        String a ="" ;
        String b = "abc";
        permutations(a, b);
        System.out.println();
        ArrayList<String> asss = permutationslist(a, b);
        System.out.println(asss);
        System.out.println(asss.size());
    }
    static void permutations(String p,String up){
           if(up.isEmpty()){
            System.out.print(p + " ");
            return;
           }
           char ch = up.charAt(0);


           for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            permutations(s+ch+f, up.substring(1));
           }
    }
    static ArrayList<String> permutationslist(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> al = new ArrayList<>();
        // System.out.println(p);
        al.add(p);
         return al;
        }
        char ch = up.charAt(0);

        ArrayList<String> as = new ArrayList<>();

        for(int i=0;i<=p.length();i++){
         String f = p.substring(0, i);
         String s = p.substring(i,p.length());
         as.addAll(permutationslist(s+ch+f, up.substring(1)));
        }
        return as;
 }
    
}

class subs{
    public static void main(String[] args) {
        String s1 = "ac";
        String s2 = "abc";
        System.out.println(s1.substring(0, 2) + " " + s1.indexOf('a'));
        System.out.println(s2.substring(0, 1));

    }
}


class comb{
    public static void main(String[] args) {
        String s = "";
        String s1 = "19";
       // comblc(s, s1);
        System.out.println();
        System.out.println(comblclList(s, s1));
    }
    // static void comblc(String p,String up){
    //     if(up.isEmpty()){
    //         System.out.print(p+" ");
    //         return;
    //     }
    //     int digit = up.charAt(0) - '0';
    //     for(int i=(digit-1)*3;i<digit*3;i++){
    //         char ch = (char)('a'+i);
    //         comblc(p+ch, up.substring(1));
    //     }
    // }
    static ArrayList<String> comblclList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> al = new ArrayList<>();
            //System.out.println(p);
            al.add(p);
            return al;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> s = new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            s.addAll(comblclList(p+ch, up.substring(1)));

        }
        return s;
}
}



class chars{
    public static void main(String[] args) {
        int digit = 'a' + 3;
        char c = 'a'+ 5;
        System.out.println(digit);
        System.out.println(c);
        // for(int i='A';i<'A'+26;i++){
        //     System.out.println((char)i);
        // }
        System.out.println('i'-0);
    }

}