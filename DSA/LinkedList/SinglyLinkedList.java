public class SinglyLinkedList {

    Node head;

   private  class Node {
        private  int val;
        private  Node next;

         Node(int val) {
            this.val=val;
            Node next=null;
        }

    }
    
    public void add(int val ){
        Node newNode=new Node(val);
        if(head==null)
          head=newNode;
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public

}
