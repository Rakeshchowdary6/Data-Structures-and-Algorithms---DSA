package DSA_Practise.Strings;

import java.util.Stack;

public class longestparanthesis {
    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(longparanthsis(s));
    }
    static int longparanthsis(String s){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxlen = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    maxlen = Math.max(maxlen, i-st.peek());

                }
            }
        }
        return maxlen;
        
    }
}
