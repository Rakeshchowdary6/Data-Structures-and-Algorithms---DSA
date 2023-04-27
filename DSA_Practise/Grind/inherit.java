package DSA_Practise.Grind;

class inherit {
    int roll=12;
    String str="hello";
    inherit(int roll, String str) {
        this.roll = roll;
        this.str = str;
    }
    inherit() {
        this.roll = -1;
        this.str=null;
    }

    inherit(inherit dk){
        this.roll = dk.roll;
        this.str = dk.str;
   }  
    static void funct(){
    System.out.println("Hello I am function in parent class");
}
    }
class childinherit extends inherit{
    int age;

    
    public childinherit(int roll,String str,int age) {
        super(roll, str);
        this.age = 25;
    }    

    
}
class Main{
    public static void main(String[] args) {

  //  inherit ob1 = new inherit();
    inherit ob2 = new inherit(12, "Rameshhhh");
 //   inherit ob3 = new inherit(ob2);

    childinherit ch1 = new childinherit(22,"rishi",45);
  //  System.out.println(ob1.roll+" "+ob1.str);
    System.out.println(ob2.roll+" "+ob2.str);
    System.out.println(ch1.age+" "+ch1.str);
    inherit.funct();
   // System.out.println(funct());        
    }
}



class parent{
    int roll;
    String name;
    parent(){

    }
    public parent(int roll, String name) {
        super();
        this.roll = roll;
        this.name = name;
    }
    void greeting(){
        System.out.println("Hey I am parent class function");
    }
}
class child extends parent{
    float salary=2000.5f;
    public child(int roll, String name, float salary) {
        super(roll, name);
        this.salary = salary;
        //greeting();
        //System.out.println(super.name);
    }   
}
class Mainn{
    public static void main(String[] args) {
        parent p = new parent(10, "Rakesh");
        child c = new child(32, "vinit", 30000.5f);
        parent p1 = new child(21, "Ganesh", 5000.5f);
        System.out.println(p.roll+" "+p.name+" "+c.roll+" "+c.name+" "+c.salary);
        System.out.println(p1.roll+" "+p1.name+" ");
        p1.greeting();
        c.greeting();
    }
}