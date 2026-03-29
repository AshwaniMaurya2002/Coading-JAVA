public class CricularLinkedList {


    Node head;
    

    class Node{

        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        
    }

    public void add(int val){
        Node newNode=new Node(val, head);
        if(head==null)
            head=newNode;
        else{
            Node temp=head;
            while(temp!=null){
                temp=temp.next;

            }
            temp.next=newNode;

        }

    
    }

    



    public static void main(String[] args) {

        CricularLinkedList cl=new CricularLinkedList();
        cl.add(12);
        
    }
    
}
