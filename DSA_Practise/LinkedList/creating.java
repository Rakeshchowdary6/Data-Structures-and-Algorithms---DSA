package DSA_Practise.LinkedList;

public class creating {
    public static void main(String[] args) {
        creating obj1 = new creating();
        obj1.addNode(2);
        obj1.addNode(4);
        obj1.display();
    }
    class Node{
        int data;
        Node next;


        public Node(int data){
               this.data = data;
               this.next = null;
        }


    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next= newNode;
            tail = newNode;
        }
    }

    public void display(){
        Node mynode = head;
        int c=0;

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(mynode!=null){
            c++;
            System.out.print(mynode.data + " ");
            mynode = mynode.next;
        }
        System.out.println();
        System.out.println(c);
    }
}



class Node{
    int data;
    Node next;

    Node(int d){
        this.data = d;
        this.next = null;
    }
    
}

class LList{
      public static void main(String[] args) {
          LList obj = new LList();
          LList obj2 = new LList();

          
          obj2.addnodee(7);
          obj2.addatfront(99);
          obj2.diplay();
          System.out.println();
          obj.addnodee(5);
          obj.addnodee(6);
          obj.addnodee(7);
          obj.addatfront(8);
          obj.addatfront(9);
          obj.addnodee(11);
          obj.addatend(8);
          obj.diplay();
      }
      public static Node head;
      public static Node tail;

      public void addnodee(int value){
        Node newnode = new Node(value);
          if(head == null){
              head = newnode;
              tail = newnode;
             // System.out.println("Added");
          }else{
              tail.next = newnode;
              tail = newnode;
          }
      }

      public void diplay(){
         Node current = head;

         while(current != null){
            // current = current.next;
             System.out.print(current.data + "-->");
             current = current.next;
         }
      }

      public void addatfront(int dataa){
        Node newNode1 = new Node(dataa);

        if(head == null){
            newNode1 = head;
            newNode1 = tail;
        }else{
            newNode1.next = head;
            head = newNode1;
           // System.out.println("adddedddd at front");
        }
      
        }
        public void addatend(int value){
            Node newNode = new Node(value);
            if(head==null){
                newNode = head;
                newNode = tail;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
}



