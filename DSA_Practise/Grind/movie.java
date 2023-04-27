package DSA_Practise.Grind;

import java.util.Scanner;

class Movie{
        
    int roll;
    String name;


    public static void main(String[] args) {
        
        Movie ob = new Movie();
        ob.roll=2;
        ob.name="John";
        System.out.println(ob.roll +" " +ob.name);


    }
    
}


class tri{
         
    float a , b;

    tri(float l , float br){
        a=l;
        b=br;
    }
    public float area(){
      float i = (a+b)/2;
      return i; 
        
    }

 public static void main(String[] args) {
    tri ar = new tri(4,4);
    tri ar2 = new tri(2,3);
    System.out.print(ar.area() + " " + ar2.area());
 }
}


class rect{
     int length , breadth;

    rect(int l , int b){
       length = l;
       breadth = b;
     }

     public int area(){
        int area= length * breadth;
        return area;
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b= sc.nextInt();
        rect ob = new rect(l,b);
        System.out.println(ob.area());
        sc.close();

     }

}



class construct{

    int roll ;
    String name;

void getdetails(int a,String y){

    roll=a;
    name=y;
}

void display(){
    System.out.println("Nothing  " +roll+ " "+name);
}

public static void main(String[] args) {
    construct c1= new construct();

   construct c2= new construct();
    c1.getdetails(44,"RAHUL");
    c2.getdetails(47,"Rohiy");
    System.out.println(c1.roll+" "+c1.name +" " +c2.name);
//    System.out.println("Second object :" +c2.roll+" "+c2.name);
//    c1.display();
//    c1.getdetails(45,"Naveen");
 //   c1.display();

}
}




class card{
   
    public static void main(String[] args) {
        
        int count=0,score=0;
        String[] a = new String[10];

        Scanner s=new Scanner(System.in);
        s.close();
        for(int i=0;i<5;i++){
            //=s.next();
        }

        for(int i=0;i<5;i++){
            if(a[i]=="A"){
                count++;
                score=score-count;
                
            }
        }
        System.out.print(count);

    }
}

        
