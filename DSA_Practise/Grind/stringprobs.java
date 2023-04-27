package DSA_Practise.Grind;

public class stringprobs {
    public static void main(String[] args) {
        
       String a = "";
        String b = "Rakesh";

        System.out.println(a);
        System.out.println(b);

        Integer n1 = 100;
        // int n2 = 200;

        // System.out.println(n1 + " " + n2);

        //   n1 = 550;

        //   System.out.println(n1);

        a = "Suresh";


        System.out.println(a);
        System.out.println(b);

        String c = new String("Rakesh");

        System.out.println(a==c || a==b);
        System.out.println(a.equals(c));

        System.out.println(n1.toString());


    float f = 2.344545453f;


    System.out.printf("%.2f",f);
    System.out.println();
    System.out.println(String.format("%.5f",f));

    StringBuilder sb = new StringBuilder();

    
  // char c = 'a';
 //  char z= 'z';
  //  System.out.println((int)z);

    //a=97 z = 122;
    
    for(int i=0;i<26;i++){
        char z = (char)('a' + i);
        sb.append(z);
    }
    System.out.println(sb.toString());

    sb.delete(1, 5);
    System.out.println(sb);

    }
}



class isPal{
    public static void main(String[] args) {
       // isPalindrome("amma");
        System.out.println(isPalindrome("Malayalam"));
    }

    static boolean isPalindrome(String str){
          String st2 = "";
       //   System.out.println(str.length());
          for(int i=str.length()-1;i>=0;i--){
                
                {
                    
                   st2+=str.charAt(i);

                }
          }
          if(str.equals(st2)){ 
            return true;

       // System.out.println(st2);
          }
          return false;
    }
}


class palind{
    public static void main(String[] args) {

        System.out.println(isPalondrom("moma"));
        
    }

    static boolean isPalondrom(String str){


        for(int i=0;i<=str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-i-1);

            if(start!=end){
                return false;
            }
           
        }
        return true;
    }
}


class newpal{
    public static void main(String[] args) {
        
      System.out.println(isPalindrome1("malazalam"));
    }
    static boolean isPalindrome1(String str){
        
        for(int i=0;i<str.length()/2;i++){
            int start = i;
            int end = str.length()-1-start;
            if(str.charAt(start)!=str.charAt(end)){
                return false;
              //  str.strip()
             // str.replace(str, str)
             
            }
        }
        return true;
    }
}



class skipachar{
    public static void main(String[] args) {
        

        System.out.println(skipacharacter("aabadc"));

        // String str = "aabdac";

        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)!='a'){
        //         s.append(str.charAt(i));
        //     }
        // }
        // System.out.println(s);


    }

    static StringBuilder skipacharacter(String str){
        StringBuilder s = new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='a'){
                s.append(str.charAt(i));
            }
        }
        return s;

    }
}

