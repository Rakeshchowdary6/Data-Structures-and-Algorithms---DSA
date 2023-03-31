package DSA_Practise.Strings;

public class firstnonrepeatingchar {
    public static void main(String[] args) {
        String s = "ggeeeef";
        System.out.println((fnc(s)));
       // System.out.println(Arrays.toString(fnc(s)));
    }
    static char fnc(String str){
        int[] arr = new int[26];

        for(int i=0;i<str.length();i++){
            int c = str.charAt(i) - 'a';
            arr[c]++;
        }
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)-'a']==1){
                  return str.charAt(i);
        }
    }
        //return str.charAt(i);
   // return arr;
        return '\u0000';
    }
}

class str{
    public static void main(String[] args) {
        String s = "asad";
        int a = 'g'-'a';
        int b = (int)s.charAt(2);
        System.out.println(a);
        System.out.println(b);
    }
}