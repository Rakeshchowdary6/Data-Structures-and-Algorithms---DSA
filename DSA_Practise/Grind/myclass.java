package DSA_Practise.Grind;

/* public class myclass{
    public static void main(String[] args) {
        
    }
}




class IfDemo {
    public static void main(String args[])
    {
        int i = 10;
 
        if (i > 15)
        System.out.println("I am Not in if");

        System.out.println("10 is less than 15");
 
        // This statement will be executed
        // as if considers one statement by default
        System.out.println("I am Not in if");
    }
}


// class ContinueDemo {
//     public static void main(String args[])
//     {
//         for (int i = 0; i < 10; i++) {
//             // If the number is even
//             // skip and continue
//             if (i % 2 == 0)
//                 break;
 
//             // If number is odd, print it
//             System.out.print(i + " ");
//         }
//     }
// }

*/













/* import java.io.*; 
import java.util.*; 
  
class GFG { 
    public static void main (String[] args) { 
        List<Integer> list = new ArrayList<>(); 
        long startTime; 
        long endTime; 
        for (int i = 0; i < 10; i++) { 
            list.add(i); 
        } 
        // Type 1 
        startTime = Calendar.getInstance().getTimeInMillis(); 
        for (int i : list) { 
            int a = i; 
        } 
        endTime = Calendar.getInstance().getTimeInMillis(); 
        System.out.println("For each loop :: " +  + (endTime - startTime) + " ms"); 
          
        // Type 2 
        startTime = Calendar.getInstance().getTimeInMillis(); 
        for (int j = 0; j < list.size(); j++) { 
            int a = list.get(j); 
        } 
        endTime = Calendar.getInstance().getTimeInMillis(); 
        System.out.println("Using collection.size() :: " + (endTime - startTime) + " ms"); 
          
        // Type 3 
        startTime = Calendar.getInstance().getTimeInMillis(); 
        int size = list.size(); 
        for (int j = 0; j < size; j++) { 
            int a = list.get(j); 
        } 
        endTime = Calendar.getInstance().getTimeInMillis(); 
        System.out.println("By calculating collection.size() first :: " + (endTime - startTime) + " ms"); 
      
        // Type 4 
        startTime = Calendar.getInstance().getTimeInMillis(); 
        for(int j = list.size()-1; j >= 0; j--) { 
            int a = list.get(j); 
        } 
        endTime = Calendar.getInstance().getTimeInMillis(); 
        System.out.println("Using [int j = list.size(); j > size ; j--] :: " + (endTime - startTime) + " ms"); 
    } 
} 

*/


class contin{
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            if(i==5){
                break;
            }
            else
            {
            System.out.println("Hello World :"+i);
            }
        }
        System.out.println("Hello World :");
    }
}





class GFG {
 
    // Since return type of RR method is void
    // so this method should return any value
    // Method 1
    void demofunction(double j)
    {
        System.out.println("hiii");
        return;
 
        // Here get compile error since can't
        // write any statement after return keyword
 
      //  ++j;
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
 
        // Calling the above defined function
        new GFG().demofunction(5);
    }
}