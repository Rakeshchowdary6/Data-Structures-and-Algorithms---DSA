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
