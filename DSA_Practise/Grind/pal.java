package DSA_Practise.Grind;


class pal 
{
    public static void main(String args[])
    {
        String st = "ammaaa";
        String rev = "";
    //    char word[] = str.toCharArray();
        int len = st.length();

    //    System.out.println(len);
  //  for (char w : word) {
   //     System.out.print(w + " " );
   // }
        for (int i=len-1;i>=0;i--){
            rev +=  st.charAt(i);
        }
        System.out.println(rev);
        System.out.println(st);
        if(st.equals(rev)){
        System.out.println("true");
        }else{
        System.out.println("fal");
    }
}
}



class palindrom1{
    public static void main(String[] args) {
        
        String str = "MY NAME IS MALAYALAM AMMA I AMA KALAK";

        System.out.println(str.indexOf("I"));
    //    char arr[] = str.toCharArray();

      //  arr[] = str.split(" ");

        System.out.println(str);
    }
}