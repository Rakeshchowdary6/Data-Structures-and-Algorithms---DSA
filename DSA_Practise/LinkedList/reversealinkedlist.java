package DSA_Practise.LinkedList;

public class reversealinkedlist {
    
    public static void main(String[] args) {
         reversealinkedlist mylist = new reversealinkedlist();
          
         ListNode node1 = mylist.new ListNode(1);
         ListNode node2 = mylist.new ListNode(2);
         ListNode node3 = mylist.new ListNode(3);
         ListNode node4 = mylist.new ListNode(4);

         ListNode head = node1;
         node1.next = node2;
         node2.next = node3;
         node3.next = node4;

         //System.out.println(reversealinkedlistt(head));
         ListNode reversedhead = reversealinkedlistt(head);
         ListNode cur = reversedhead;
         while(cur!=null){
            System.out.print(cur.data+ "-->");
            cur = cur.next;
         }

    }
    public class ListNode{
         int data;
         ListNode next;

        public ListNode(int data){
            this.data = data;
        }
        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = null;
        }

         
    }
    public static ListNode reversealinkedlistt(ListNode head){

        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode mynode = current.next;

            current.next = prev;
            prev = current;
            current = mynode;
        }

        return prev;
    }
}



