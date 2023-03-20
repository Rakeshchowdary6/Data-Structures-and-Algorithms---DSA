//package Practise;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class collectionspractise {
    public static void main(String[] args) {
        
      ArrayList<Integer> al = new ArrayList<Integer>();
      LinkedList<String> ll = new LinkedList<String>();
      Vector<Float> v = new Vector<Float>();
      Stack<Integer> s = new Stack<>();
      //Map<Integer,Integer> mpp =new HashMap<>();

     

      al.add(10);
      al.add(20);
      al.add(30);
      al.toArray();
      al.add(0, null);
      //System.out.println(al.isEmpty());

      ll.add("Rakesh");
      ll.add("Suresh");
      ll.add("Bharath");
      
      v.add(10.5f);
      v.add(20.5f);
      v.addElement(30.5f);
      v.add(40.5f);

      s.addAll(al);
      
      

      System.out.println(al);
      System.out.println(ll);
      System.out.println(v);
      System.out.println(s.peek());
    
    }
}



class Solution {

  public static void main(String[] args) {
    int arr[] = {1,2,3,1,1,3};
    int a= numIdenticalPairs(arr);
    System.out.println(a);
  }
    static int numIdenticalPairs(int[] nums) {
        int s=0,e=nums.length-1;
        int c=0;
        int i=0;
        List<Integer> al = new ArrayList<Integer>();

        if(nums[i]!=i && !al.contains(i)){
             if(nums[s]==nums[e] && s<e){
                 c++;
             }else if(nums[s]!=nums[e]){
                 e--;
             }else{
                 s++;
             }
        }
        return c;
    }
}

