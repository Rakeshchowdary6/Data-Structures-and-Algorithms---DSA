package DSA_Practise.LinkedList;

public class linkedsingle {
    public static void main(String[] args) {
        linkedsingle o1 = new linkedsingle();
        o1.addnode(5);
        o1.addnode(6);
        o1.addnode(7);
        o1.addatfront(4);
        o1.display();
    }

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head ;
    public Node tail ;

    public void addnode(int data){
        Node newnode = new Node(data);


        if(head == null){
             head = newnode;
             tail = newnode;
             System.out.println("added" + " " + data);
        }else{
           // newnode.data = data;
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void display(){
          Node current = head;

          while(current!=null){
            //System.out.println("No items to display");
            System.out.println(current.data);
            current = current.next;
          }
    }

    public void addatfront(int data){
          Node newnode = new Node(data);

          if(head == null){
              head = newnode;
              tail = newnode;
          }else{
              newnode.next = head;
              head = newnode;
          }
    }


}
